
public class Empleado {
	private String nombre;
	private int añoIngreso;
	private String cargo;
	
	public Empleado() {
		nombre="Maria";
		añoIngreso=2018;
		cargo="secretaria";
	}

	public Empleado(String nom) {
		nombre = nom;
		añoIngreso=2016;
		cargo="director";
	}
	public void mostrar(){
		System.out.println("Nombre: "+nombre);
		System.out.println("Año de ingreso: "+añoIngreso);
		System.out.println("Cargo : "+cargo);
	}
	public void setNombre(String nom){
		nombre=nom;
	}
	public String getNombre(){
		return nombre;
	}


	public int getAñoIngreso() {
		return añoIngreso;
	}


	public void setAñoIngreso(int añoIngreso) {
		this.añoIngreso = añoIngreso;
	}

}
