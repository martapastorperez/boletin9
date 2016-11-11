
package boletin9_4;

import javax.swing.JOptionPane;


public class Tabla {
    int numero;
 public Tabla(){  
 } 
 public void multiplicar(){
     int numero;
    int i=1;
    
    do{
        i=1;
     numero=Integer.parseInt(JOptionPane.showInputDialog("Introduce número"));
      if(numero!=0){
     
     do{
         System.out.println(numero+"*"+i+"="+numero*i);
         i++;
     }while(i<=10);
      }   
    
 } while(numero!=0);
       System.out.println("ADIOS");
     
       
         
     
     
 }
}
