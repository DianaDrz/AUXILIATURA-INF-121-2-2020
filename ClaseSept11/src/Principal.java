
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// a)Instanciar 2 objetos Empresa y 2 Objetos empleado de 
		//diferente manera y deben mostrar sus datos.
		/*
		System.out.println("---------------------------------------");
		Empleado e1=new Empleado();
		e1.mostrar();
		System.out.println();
		Empleado e2= new Empleado("Carlos");
		e2.mostrar();
		System.out.println("---------------------------------------");
		
		*/
		System.out.println("         ");
		//Empresa emp2=new Empresa("Tigo");
		//emp2.mostrar();
		//System.out.println("------------------b)---------------------");
		//b) Dado un objeto Empresa buscar al empleado de nombre x y mostrar sus datos
		//emp1.buscar("pepe");
		//c) Adicionar al Ojeto empresa un empleado 
		
		Empresa emp1=new Empresa();
		emp1.mostrar();
		emp1.adicionar(Leer.dato(), Leer.dato(), Leer.dato());
		emp1.mostrar();
		
	}

}
