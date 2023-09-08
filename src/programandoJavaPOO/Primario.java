package programandoJavaPOO;

import java.util.Scanner;

public class Primario {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String name = obj.nextLine();
        int age = obj.nextInt();
        int roomNumber = obj.nextInt();

<<<<<<< HEAD
        Secundario secundario = new Secundario(0.1f,200);
        System.out.println("La velocidad Inicial es :"+secundario.velocidadInicial);
        secundario.acelerar();
        System.out.println("Se acelero hasta :"+secundario.velocidadInicial);
        System.out.println("La velocidad Maxima que llega es : "+secundario.velocidadMaxima);
        secundario.setColor("Green");
        String color = secundario.getColor();
        System.out.println("El color de Vehiculo es : "+color);
        secundario.setMarca("Suzuki");
        System.out.println("La Marca del Vehiculo es :"+secundario.getMarca());

=======
        Terciario terciario = new Terciario();
        terciario.setName(name);
        terciario.setAge(age);
        terciario.setRoomNumber(roomNumber);
        terciario.mostrarDatos();
>>>>>>> version_3


    }
}
