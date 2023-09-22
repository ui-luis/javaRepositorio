package programandoJavaPOO;

import java.util.Scanner;

public class Primario {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Dijite Nombre : ");
        String name = obj.nextLine();
        System.out.println("Dijite Edad : ");
        int age = obj.nextInt();
        System.out.println("Dijite Numero de Habitaciones : ");
        int roomNumber = obj.nextInt();

        Terciario terciario = new Terciario();
        terciario.setName(name);
        terciario.setAge(age);
        terciario.setRoomNumber(roomNumber);
        terciario.mostrarDatos();

        Secundario secundario = new Secundario(0.1f,200);
         System.out.println("---TITULO DE LA TIENDA DE VEHICULOS----");
        System.out.println("La velocidad Inicial es :"+secundario.velocidadInicial);
        secundario.acelerar();
        System.out.println("Se acelero hasta :"+secundario.velocidadInicial);
        System.out.println("La velocidad Maxima que llega es : "+secundario.velocidadMaxima);
        secundario.setColor("Green");
        String color = secundario.getColor();
        System.out.println("El color de Vehiculo es : "+color);
        secundario.setMarca("Suzuki");
        System.out.println("La Marca del Vehiculo es :"+secundario.getMarca());


        Saludar saludar = new Saludar();
        saludar.mostrarSaludo();



    }
}
