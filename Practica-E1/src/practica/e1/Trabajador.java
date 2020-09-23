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
public class Trabajador {
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private double sueldo;
    private String area;
    
    public String getNombre() {
        return nombre;
        
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String getAre() {
        return area;
    }

    //alt+ins
    public void setAre(String are) {
        this.area = are;
    }
    //a) Instanciar a 2 trabajadores
    public Trabajador() {
        nombre="Maria";
        apellidoPaterno="Perez";
        apellidoMaterno="Ortiz";
        sueldo=8000;
        area="direccion";
    }

    public Trabajador(String n) {
        nombre = n;
        apellidoPaterno="Alonzo";
        apellidoMaterno="Aliaga";
        sueldo=5000;
        area="a1";
    }
    //sout+ctrl+spacio
    public void mostrar(){
        System.out.println("Nombre: "+nombre);
        System.out.println("AP: "+apellidoPaterno);
        System.out.println("AM: "+apellidoMaterno);
        System.out.println("Sueldo: "+sueldo);
        System.out.println("Area: "+area);
    }
    //c) Mostrar el nombre y apellidos del trabajador que gana más.
    public void mayorSueldo(Trabajador t){
        if(this.getSueldo()>t.getSueldo())
            System.out.println(this.getNombre()+" "+this.getApellidoPaterno()+" "+this.getApellidoMaterno());
        else 
            System.out.println(t.getNombre()+" "+t.getApellidoPaterno()+" "+t.getApellidoMaterno());
    }
    //d) Cambiar el área del trabajador 1 al área en la que se encuentra el trabajador

    
}
