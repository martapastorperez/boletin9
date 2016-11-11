
package boletin9_3;

import javax.swing.JOptionPane;


public class Rectangulo {
   private float base,altura;
   public Rectangulo(){
       
   }
   public Rectangulo(float ba, float al){
       base=ba;
       altura=al;
   }
   public void calcularArea(){
       
      do{   
         base=Float.parseFloat(JOptionPane.showInputDialog("Introducir base"));
       }while(base<0);
       do{
          altura=Float.parseFloat(JOptionPane.showInputDialog("Introducir altura"));
       }while(altura<0);
           System.out.println(base+"*"+altura+"="+base*altura);
      
   }
}