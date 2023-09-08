package programandoJavaPOO;

public class Terciario {

   private  String name;
    private int age;
    private int roomNumber;

    public void setName(String name){ this.name = name;}
    public String getName(){return name;}
    public void setAge(int age){ this.age = age;}
    public int getAge(){return age;}

    public void setRooNumber(int roomNumber){this.roomNumber = roomNumber;}
    public int getRoomNumber(){return roomNumber;}

    public void mostrarDatos(){
        System.out.println("El nombre es : "+getName());
        System.out.println("La edad es : "+getAge() +" Años");
        System.out.println("El numero de Habitacion es : "+" # "+getRoomNumber());
    }

}
