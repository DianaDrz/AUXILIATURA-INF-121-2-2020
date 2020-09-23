/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.e1;

/**
 *
 * @author pc
 */
public class PracticaE1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // para hacerlo correr rapidamente shift+f6
        System.out.println("-------------------a)y b)--------------------");
        Trabajador t1= new Trabajador();
        Trabajador t2= new Trabajador("Pepe");
        t1.mostrar();
        System.out.println("******************************************");
        t2.mostrar();
        System.out.println("-------------------c)---------------------");
        t1.mayorSueldo(t2);
        System.out.println("-------------------d)---------------------");
        String a=t2.getAre();
        t1.setAre(a);
        t1.mostrar();
        
        
    }
    
}
