package POO.clases;

public class Main {
    public static void main(String[] args) {
        Coche coche1 = new Coche();
        System.out.println("Puertas :"+coche1.numeroDePuertas);
        System.out.println("Velocidad Maxima :"+coche1.velocidadMaxima);
        System.out.println("Velocidad Actual :"+coche1.velocidadActual);

        Coche coche = new Coche(4,400);
        System.out.println("Puertas :"+coche.numeroDePuertas);
        System.out.println("Velocidad Maxima :"+coche.velocidadMaxima);
        System.out.println("Velocidad Actual :"+coche.velocidadActual);


        /*System.out.println(coche.velocidadActual);
        coche.acelerar();
        System.out.println(coche.velocidadActual);
        coche.decelerar();

        Coche coche2 = new Coche();
        System.out.println(coche2.velocidadActual);*/
        SaludarPorTerceraVez saludar = SaludarPorTerceraVez();
        saludar.mostrarSaludo();

    }
}

class Coche{
    int numeroDePuertas;
    int velocidadMaxima;
    float velocidadActual;

    public Coche(){
        System.out.println("Estoy disparando sin parametros");
        numeroDePuertas = 2;
        velocidadMaxima = 120;

    }
    public Coche(int numeroDePuertas,int velocidadMaxima){
        System.out.println("Estoy disparando con parametros");
        this.numeroDePuertas = numeroDePuertas;
        this.velocidadMaxima = velocidadMaxima;
    }

}
