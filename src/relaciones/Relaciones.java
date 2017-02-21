/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relaciones;

/**
 *
 * @author Estudiante
 */
public class Relaciones {
    public oficina f;
    private oficina trabaja;
    public static void main(){
            oficina f =new oficina ("Bogotá");
            persona p=new persona ("Luz");
            p.trabaja=f;
            System.out.println(p.dardireccion);
       }
    }        
}     
          
  
    
        
    
    
       
