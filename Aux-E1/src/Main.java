
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("----------------------A--------------------");
		Puesto p1= new Puesto();
		p1.mostrar();
		System.out.println("----------------------B--------------------");
		Puesto p2=new Puesto("Maria","Quiroga");
		p2.mostrar();
		System.out.println("--------------Verificar--------------------");
		
		if(p1.verificar("cebolla"))
			System.out.println("Si se encuentra");
		else 
			System.out.println("No se encuentra");
		
		System.out.println("------------------Verificar2---------------");
		
		if(p1.verificar2(p2))
			System.out.println("Si se encuentra");
		else 
			System.out.println("No se encuentra");
		System.out.println("--------------------mayor--------------------");
		System.out.println(p1.mayor());
		System.out.println("----------Todos los mayores------------------");
		p1.mayor2();
		System.out.println("---------Todos los mayores con forma 2--------");
		p1.mayorForma2();
	}

}
