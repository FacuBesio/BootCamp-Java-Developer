package Comparable;

public class Auto implements Comparable<Auto> {

    private String marca;
    private String modelo;
    private String color;

    

    public Auto() {
    }

    public Auto(String marca, String modelo, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }
   
/* El Método compareTo () retorna un número entero donde si el Objeto ingresado se considera que es menor se va a devolver un 
    -1, si es igual un 0, y si es mayor un 1.
    El TreeSet usa este Método para Comparar y crear el orden. 
*/
    @Override
    public int compareTo(Auto auto) {
        String thisAuto = this.getMarca() +","+ this.getModelo() +","+ this.getColor();
        String paraAuto = auto.getMarca() +","+ auto.getModelo() +","+ auto.getColor(); //para => parametro
        return  thisAuto.compareToIgnoreCase(paraAuto);
        }
/*  Usa el compareTo() de la Clase String, que ya establece un orden Alfabético naturalmente. Segun como se declaren los Strings
    a comprar sera el orden de prioridad establecido, es decir, que Atributo tomara como prioridad para empezar a ordenar, cual 
    sera el segundo, etc.
    
    ' String thisClase = this.getAtributo1() +","+ this.getAtributo2() +","+ this.getAtributo3();
      String paraClase = this.getAtributo1() +","+ this.getAtributo2() +","+ this.getAtributo3();
    
    Si el resultado lo multiplico por -1 invierto el orden. 
*/
    
    @Override
    public String toString() {
        return "Auto{" + "marca=" + marca + ", modelo=" + modelo + ", color=" + color + '}';
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}