
public class Empleado {
	private String nombre;
	private int a�oIngreso;
	private String cargo;
	
	public Empleado() {
		nombre="Maria";
		a�oIngreso=2018;
		cargo="secretaria";
	}

	public Empleado(String nom) {
		nombre = nom;
		a�oIngreso=2016;
		cargo="director";
	}
	public void mostrar(){
		System.out.println("Nombre: "+nombre);
		System.out.println("A�o de ingreso: "+a�oIngreso);
		System.out.println("Cargo : "+cargo);
	}
	public void setNombre(String nom){
		nombre=nom;
	}
	public String getNombre(){
		return nombre;
	}


	public int getA�oIngreso() {
		return a�oIngreso;
	}


	public void setA�oIngreso(int a�oIngreso) {
		this.a�oIngreso = a�oIngreso;
	}

}
