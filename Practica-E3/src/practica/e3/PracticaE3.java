/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.e3;

/**
 *
 * @author pc
 */
public class PracticaE3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //a) Instanciar al menos 4 mascotas de diferente manera.
        System.out.println("-------------------------a)-------------------------");
        Mascota m1=new Mascota();
        Mascota m2=new Mascota("gato");
        Mascota m3=new Mascota("gato","Kity");
        Mascota m4=new Mascota("loro","croqueta","verde");
        m1.mostrar();
        System.out.println("***********************************************");
        m2.mostrar();
        System.out.println("***********************************************");
        m3.mostrar();
        System.out.println("***********************************************");
        m4.mostrar();
        System.out.println("-------------------------b)-------------------------");
        m2.verificar("perro","pastor aleman");
        System.out.println("-------------------------c)-------------------------");
        m1.contar("gato", m2, m3, m4);
        System.out.println("-------------------------d)-------------------------");
        m1.verificar2(m4);
    }
    
}
