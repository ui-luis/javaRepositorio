package POO.herencia;

public class Main {
    public static void main(String[] args) {
        Vehiculo1 coche1 = new Vehiculo1();

        coche1.setTipo("Coche");
        String tipo = coche1.getTipo();
        System.out.println(tipo);


        Vehiculo1 moto = new Vehiculo1();

        moto.setTipo("De carrera");
        System.out.println(moto.getTipo());
    }

}

class Vehiculo1{
   private String tipo;

   public void setTipo(String tipo){
       this.tipo = tipo;
   }
   public String getTipo(){
       return this.tipo;
   }

}
