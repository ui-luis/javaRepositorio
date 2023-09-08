package programandoJavaPOO;

import java.util.Scanner;

public class Primario {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String name = obj.nextLine();
        int age = obj.nextInt();
        int roomNumber = obj.nextInt();

        Terciario terciario = new Terciario();
        terciario.setName(name);
        terciario.setAge(age);
        terciario.setRooNumber(roomNumber);
        terciario.mostrarDatos();


    }
}
