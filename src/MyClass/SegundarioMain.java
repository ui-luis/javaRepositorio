package MyClass;

import java.util.Scanner;

public class SegundarioMain {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String name = read.nextLine();
        int age = read.nextInt();

        Student student = new Student();
        student.name = name;

        student.setAge(age);
        int edad = student.getAge();

        if( edad < 0){
            System.out.println(" Invalid age ");
            System.out.println("Name : " + student.name);

            System.out.println("Age : " +0);
        }else{
            System.out.println("Name : " + student.name);
            System.out.println("Age : " +edad);
        }





    }
}

class Student {

    public String name;
    private int age;

    public int getAge() {
        //complete Getter
        return this.age;

    }
    public void setAge(int age) {
        //complete Setter
        this.age = age;
    }
}
