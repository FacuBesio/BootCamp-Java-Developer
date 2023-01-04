package Ejemplo2_Aeropuerto;

public class Aeropuerto {
	
	public void darPermisoDeAterrizar(Volador v){
		
		v.aterrizar();
	/*  
	Se esta indicando como Parámetro un Objeto  que tenga implementado la Interface. Esto nos va a permitir poder acceder 
	'genericamente' a los Métodos declarados en la Interfaz. 
    Cualquier Objeto instanciado desde una Clase que Implemente la Interfaz sera compatible para ingresar como Parametro. 
    Por definición contendra dentro sus Métodos, el Método de la Interfaz  Sobreescritro (@Override) y por este motivo sera 
    compatible para ingresar como Párametro. 
	El comportamiento del método de la Interfaz Volador 'public void aterrizar()' dependera de la Clase que haya instanciado al Objeto. 
	
	        
	Se Castea el Objeto Interfaz para poder acceder a los Miembros particulares de cada Clase.
	 */
        if( v instanceof AvionPrivado ){
        AvionPrivado av_pri = (AvionPrivado)v;
        System.out.println("Licencia: " + av_pri.getLicencia());
        }

        if( v instanceof AvionDePasajeros ){
        AvionDePasajeros av_pas = (AvionDePasajeros)v;
        System.out.println("Aerolinea: " + av_pas.getAerolinea());
        }

        if( v instanceof AvionDeCarga ){
        AvionDeCarga av_car = (AvionDeCarga)v;
        System.out.println("Tipo: " + av_car.getTipo());
        }
    }
}
