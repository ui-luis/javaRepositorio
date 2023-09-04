package Proyecto1;

import java.util.ArrayList;
public class Segundo {
    public static void main(String[] args) {

        ArrayList<String> valor = new ArrayList<String>();
        valor.add("Lunes");
        valor.add("Martes");
        valor.add("Miercoles");
        valor.add("Jueves");
        valor.add("Viernes");
        valor.add("Miercoles");
        valor.add("Domingo");

        System.out.println("Muestra la posision por el indice "+valor.get(3));
        System.out.println("Muestra la cantidad "+valor.size());
        System.out.println(valor.contains("Busca si existe el dato o valor "+"Sabado"));
        System.out.println("Muestra la posision de mi dato a buscar "+valor.indexOf("Miercoles"));
        System.out.println("Muestra la posision de indice a buscar de abajo hacia arriba "+valor.lastIndexOf("Miercoles"));

        valor.remove(2);
        System.out.println("Valor previo eliminado "+valor.get(2));


         //valor.clear();// Sirve para limpiar datos
         System.out.println(valor.get(5));
         System.out.println("Evalua si esta vacio o no el ArrayList "+valor.isEmpty());

         //hemos creado otro ArrayList y tambien se copia los datos del primer ArrayList
         ArrayList<String> datos = new ArrayList<>(valor);

         //Se procede a trabajar con el segundo ArrayList
        System.out.println("Trabajando con la version Copia "+datos.get(5));

        //Covirtiendo a un Array o vertor normal
        String [] vector = new String[valor.size()];
        valor.toArray(vector);
        System.out.println("Ahora ya es un array o vector puro "+ vector[1]);





    }
}
