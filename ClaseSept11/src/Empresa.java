
public class Empresa {
	private String nombreEmpresa;
	private int nroEmpleados;
	private String empleados[][]= new String[50][4];
	//columna 1		columna 2 	columna 3
	//nombre		añoIngreso	cargo
	// Jose			2017 		A1
	
	/*
	 private String empleados[][]= new String[4][50];
	 //fila 0 nombre jose
	 //fila 1 añoIngreso 2017
	 //fila 2 cargo a1
	 */
	
	
	// constructor sin parametros
	public Empresa() {
		nombreEmpresa="Entel";
		nroEmpleados=4;
		empleados[1][1]="Jose";empleados[1][2]="2019";empleados[1][3]="a1";
		empleados[2][1]="Juan";empleados[2][2]="2017";empleados[2][3]="a2";
		empleados[3][1]="Pepe";empleados[3][2]="2015";empleados[3][3]="a3";
		empleados[4][1]="Ana";empleados[4][2]="2013";empleados[4][3]="a4";
	}
	// constructor con parametros
	public Empresa(String nombre){
		nombreEmpresa=nombre;
		nroEmpleados=3;
		empleados[1][1]="Antonio";empleados[1][2]="2012";empleados[1][3]="b1";
		empleados[2][1]="Elsa";empleados[2][2]="2011";empleados[2][3]="b2";
		empleados[3][1]="Julio";empleados[3][2]="2018";empleados[3][3]="b3";
	}
	// metodo mostrar
	public void mostrar(){
		System.out.println("Nombre de la empresa : "+nombreEmpresa);
		for (int i = 1; i <=nroEmpleados; i++) {
			System.out.println(empleados[i][1]+"\t"+empleados[i][2]+"\t"+empleados[i][3]);
		}
	}
	
	//Dado un objeto Empresa buscar al empleado de NOMBRE X y mostrar sus datos
	
	public void buscar(String x){
		for (int i = 0; i < nroEmpleados; i++) {
			if(empleados[i][1].equals(x)){
				System.out.println(empleados[i][1]+"\t"+empleados[i][2]+"\t"+empleados[i][3]);
			}
		
		}
	}
	//c) Adicionar al Ojeto empresa un empleado 
	public void adicionar(String x,String y,String z){
		nroEmpleados++;
		empleados[nroEmpleados][1]=x;empleados[nroEmpleados][2]=y;empleados[nroEmpleados][3]=z;
	}

}
