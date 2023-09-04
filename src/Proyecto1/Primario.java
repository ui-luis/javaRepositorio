package Proyecto1;

import java.util.Hashtable;
import java.util.Scanner;

public class Primario {
    public static void main(String[] args) {


        String [] semana ={"lunes","martes","miercoles","miercoles","jueves","viernes","sabadado","domingo"};
        int [] num = new int[5];
            num[0] = 1;
            num[1] = 212;
            num[2] = 321;
            num[3] = 456;
            num[4] = 564;
        Hashtable<Integer, String> semana1 = new Hashtable<Integer, String>();
        semana1.put(45,"Domingo");
        semana1.put(4,"Amanecer");
        semana1.put(458,"Comida");
        semana1.put(789,"Salas");
        semana1.put(123,"Pool");

        System.out.println(semana1.get(4));
        System.out.println(semana[0]);
        System.out.println(num[0]);




    }
}
