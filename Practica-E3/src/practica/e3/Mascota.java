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
public class Mascota {
    private String tipo;
    private String nombre;
    private String color;
    private String raza;
    private int edad;

    public Mascota() {
        tipo="gato";
        nombre="croqueta";
        color="blanco";
        raza="albino";
        edad=2;
    }

    public Mascota(String t) {
        tipo=t;
        nombre ="Copito";
        color="cafe";
        raza="pastor";
        edad=3;
    }
    public Mascota(String t,String n) {
        tipo=t;
        nombre =n;
        color="naranjado";
        raza="Mestizo";
        edad=1;
    }
    public Mascota(String t,String n,String c) {
        tipo=t;
        nombre =n;
        color=c;
        raza="Mestizo";
        edad=4;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public void mostrar(){
        System.out.println("Tipo: "+ tipo);
        System.out.println("Nombre: "+nombre);
        System.out.println("Color: "+color);
        System.out.println("Raza: "+ raza);
        System.out.println("Edad :"+edad);
    }
    //b) Verificar si existe el “PERRO”, de raza “PASTOR ALEMÁN”
    public void verificar(String t,String r){
        boolean sw=false;
        if(this.getTipo().equals(t)&&this.getRaza().equals(r))
            sw=true;
        if(sw) System.out.println("Si existe");
        else System.out.println("No existe");
    }
    //c) Contar cuántas mascotas de tipo “gato” existen.
    public void contar(String x,Mascota m2,Mascota m3, Mascota m4){
        int a=0;
        if(this.getTipo().equals(x))
            a++;
        if(m2.getTipo().equals(x))
            a++;
        if(m3.getTipo().equals(x))
            a++;
        if(m4.getTipo().equals(x))
            a++;
        System.out.println("La cantidad total es:"+a);
    }
    //d) Verificar si existen 2 mascotas con el mismo nombre y si existen imprimir de que tipo
    //son cada una
    
    public void verificar2(Mascota m2){
        if(this.getNombre().equals(m2.getNombre()))
            System.out.println("La mascota 1 es de tipo: "+this.getTipo()+"\tLa mascota 2 es de tipo: "+m2.getTipo());
        else
            System.out.println("No existen mascotas con el mismo nombre");
    }

    
}
