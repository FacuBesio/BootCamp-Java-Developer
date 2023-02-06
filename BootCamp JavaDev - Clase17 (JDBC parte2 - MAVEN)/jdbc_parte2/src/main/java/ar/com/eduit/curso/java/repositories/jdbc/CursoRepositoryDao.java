package ar.com.eduit.curso.java.repositories.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import ar.com.eduit.curso.java.entities.Curso;
import ar.com.eduit.curso.java.enums.Dia;
import ar.com.eduit.curso.java.enums.Turno;
import ar.com.eduit.curso.java.repositories.interfaces.I_CursoRepository;

public class CursoRepositoryDao implements I_CursoRepository{

/* Se define como Atributo de Clase a un Objeto Connection para que pueda recibir la Conexión a la BBDD y será un Parámetro 
	que se ingresara por Constructor. Es decir, la única forma de crear un objeto CursoRepositoryDao será definiedo una 
	Conexión a la BBDD en el constructor.  
*/ 
	private Connection conn;
	
	
	public CursoRepositoryDao(Connection conn) {
		this.conn = conn;
	}


	
	@Override
	public void save(Curso curso) {

/*	No se recomienda la siguiente forma de diseñar una query!
        
         String query_ejemplo="insert into cursos (titulo,profesor,dia,turno) values ('"+ curso.getTitulo() +"','"
                                                                                        + curso.getProfesor()+"','"
                                                                                        + curso.getDia()+"','"
                                                                                        + curso.getTitulo()
                                                                                        +"')";
        
    Tiene un nivel de seguridad muy vulnerable esta forma de deseñar la query, ademas de ser visualemente complejo
    cuando se trabaja con mucho atributos.
         
	Mediante el uso de la PreparedStatment Java se va a encargar de Inyectar los parámetros, y hacer un control de la seguridad 
   	de esos parámetros. Va a bloquear automáticamente caracteres considerados raros y que pueden comprometer el sistema de 
   	seguridad de la Aplicación. Va a permitir solo el uso de caracteres seguros. 
   	El Objeto prepareStatement("sentencia SQL") lo vamos a poder crear a partir de nuestra Conexión y no solo nos brindara 
   	seguirdad al ingresar los parámetros, sino que tambien automatizará el ingreso de los mismos.
*/	
	if(curso==null) return;
	String query="insert into cursos (titulo,profesor,dia,turno) values (?,?,?,?)";		

	try (PreparedStatement ps=conn.prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS);){
	//	RETURN_GENERATED_KEYS retorna la claves principales generadas en la BBDD. Es una Constante Estatica. 
        	
			ps.setString(1, curso.getTitulo());
            ps.setString(2, curso.getProfesor());
            ps.setString(3, curso.getDia().toString()); 	// Hay que pasar el Enum como String para que llegue asi a la BBDD.
            ps.setString(4, curso.getTurno().toString());
            ps.execute(); 									//Ejecuto el Codigo.
            
            // Con esta sentencia obtenemos el ID generado. Devuelve un Conjunto de Registro que va a tener las Claves generedas.
            ResultSet rs=ps.getGeneratedKeys(); 
            
            if(rs.next()) curso.setId(rs.getInt(1)); 
        /*Si hay un registro de Id generado quiere decir que se ingreso correctamente en la BBDD. Es decir, 
        el usuario se da cuenta que se ingreso el Curso, cuando el Objeto Curso tiene un ID. */
    } catch (Exception e) {
            System.out.println(e);
        }
    }

	@Override
    public void remove(Curso curso) {
        if(curso==null) return;
        String query="delete from cursos where id="+curso.getId();
        try (Statement st=conn.createStatement()) {
            st.execute(query);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

	@Override
    public void update(Curso curso) {
        if(curso==null) return;
        String query="update cursos set titulo=?, profesor=?, dia=?, turno=? where id=?";
        /*Es mas 'barato' pisar nuevamente todo el Registro, que averiguar cual de todos los Parámetros fue cambiado. */
        try (PreparedStatement ps=conn.prepareStatement(query)) {
            ps.setString(1, curso.getTitulo());
            ps.setString(2, curso.getProfesor());
            ps.setString(3, curso.getDia().toString());
            ps.setString(4, curso.getTurno().toString());
            ps.setInt(5, curso.getId());
            ps.execute();
        } catch (Exception e) {
             System.out.println(e);
        }
    }

	@Override
	public List<Curso> getAll() {
		List<Curso>list=new ArrayList<Curso>();
        try (ResultSet rs=conn.createStatement().executeQuery("select * from cursos")){ 
/*	El rs recibe el Conjunto de Registros de la Consulta SQL. Por cada Registro se va agregar un Elemento a la Lista, es decir, 
  	por cada Registro que tenga 'rs' se creara un nuevo objeto Curso y se va a agregar a 'list'. 'rs.next()' devolvera un 'true' 
  	siempre que exista un proximo registro. Cuando devuelva False indica que no hay mas Registros (o nunca hubo).
*/
            while(rs.next()){ 
                list.add( 					// Por cada Registro se va a agregar un Elemento objeto Curso a la Lista.
                    new Curso(
                    rs.getInt("id"), 
                    rs.getString("titulo"), 
                    rs.getString("profesor"), 
                    Dia.valueOf(rs.getString("dia")), // Desde la BBDD se trae como una String, con el  Método 'Enum.valueOf()'
                    Turno.valueOf(rs.getString("turno")) // se puede transformar un valor String en un valor del Enumerado 
                    )                                    
                );
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return list;
    }

	  @Override
	    public Curso getById(int id) {
	        Curso curso=new Curso();
	        try (ResultSet rs=conn.createStatement().executeQuery("select * from cursos where id="+id)){
	            if(rs.next()){
	                curso=new Curso(
	                rs.getInt("id"), 
	                rs.getString("titulo"), 
	                rs.getString("profesor"), 
	                Dia.valueOf(rs.getString("dia")), 
	                Turno.valueOf(rs.getString("turno"))
	                );
	            }
	        } catch (Exception e) {
	            System.out.println(e);
	        }  
	        return curso;
	    }

	  @Override
	    public List<Curso> getLikeTitulo(String titulo) {
	        List<Curso>list=new ArrayList();
	        try (ResultSet rs=conn.createStatement().executeQuery("select * from cursos where titulo like '%"+titulo+"%'")){
	            while(rs.next()){
	                list.add(
	                        new Curso(
	                        rs.getInt("id"), 
	                        rs.getString("titulo"), 
	                        rs.getString("profesor"), 
	                        Dia.valueOf(rs.getString("dia")), 
	                        Turno.valueOf(rs.getString("turno"))
	                        )
	                );
	            }
	        } catch (Exception e) {
	            System.out.println(e);
	        }
	        return list;
	    }

}
