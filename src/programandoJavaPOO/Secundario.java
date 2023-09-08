package programandoJavaPOO;

import javax.sound.midi.Soundbank;

public class Secundario {
    // atributos
    // constructores
    // metodos
   private String color;
   private String marca;

   public String getMarca(){
       return marca;
   }
   public void setMarca(String marca){
       this.marca = marca;
   }
   public void setColor(String color){
       this.color = color;
   }
   public String getColor(){
       return color;
   }
    float velocidadInicial;
    float velocidadMaxima;

    public Secundario(float velocidadInicial,float velocidadMaxima){
        System.out.println("Estoy en el contructor ");
        this.velocidadInicial = velocidadInicial;
        this.velocidadMaxima = velocidadMaxima;
    }

    public void acelerar(){
        velocidadInicial +=15.2;
    }

}
