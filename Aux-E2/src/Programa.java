
public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("------------------CONSTRUCTOR POR DEFECTO-----------------");
		Polinomio p1=new Polinomio();
		p1.mostrar();
		System.out.println("");
		System.out.println("------------------CONSTRUCTOR CON PARAMETROS-------------------");
		Polinomio p2=new Polinomio("4","5","1","0");
		p2.mostrar();
	}

}
