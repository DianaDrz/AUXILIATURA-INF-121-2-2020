
public class Polinomio {
	private int nroTerminos;
	// private String [,] polinomios=new String [50,3];----> C#
	private String [][] polinomios=new String [50][3];
	// 5x2+3x+4
	public Polinomio() {
		nroTerminos=3;
		polinomios[1][1]="5";polinomios[1][2]="2";
		polinomios[2][1]="3";polinomios[2][2]="1";
		polinomios[3][1]="4";polinomios[3][2]="0";
	}
	//4x+5
	public Polinomio(String c1,String c2,String e1,String e2) {
		nroTerminos=2;
		polinomios[1][1]="4";polinomios[1][2]="1";
		polinomios[2][1]="5";polinomios[2][2]="0";
	}
    
	public void mostrar(){
		for (int i = 1; i <=nroTerminos; i++) {
			System.out.print(polinomios[i][1]+ " x^ "+polinomios[i][2]+" + ");
		}
	}
	
	// TAREA PARA LA SIGUIENTE SEMANA: agregar N terminos a un polinomio
}

