package POO.clases;

public class Vehiculo {
    //1. Atributos
    String fabriante;
    String modelo;
    double year;
    boolean sport;

    //2. constructores
    public Vehiculo(){

    }

    public Vehiculo(String fabriante, String modelo, double year, boolean sport) {
        this.fabriante = fabriante;
        this.modelo = modelo;
        this.year = year;
        this.sport = sport;
    }

    public Vehiculo(String fabriante, String modelo) {
        this.fabriante = fabriante;
        this.modelo = modelo;
    }

    // 3. metodos (comportamiento)

}
