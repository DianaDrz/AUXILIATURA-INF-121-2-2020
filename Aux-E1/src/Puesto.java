
public class Puesto {
	
	private String nomVen;
	private String apellidoV;
	private int nroProd;
	private String productos[]=new String [100];
	private int precio[]=new int [100];
	
	//POR DEFECTO O SIN PARAMETROS alt+shift+S+C -->eclipse  
	public Puesto() {
		nomVen= "Maria";
		apellidoV= "Apaza";
		nroProd=3;
		productos[1]="cebolla"; precio[1]=23;
		productos[2]="tomates";precio[2]=6;
		productos[3]="locoto";precio[3]=23;
	}
	//CONSTRUCTOR CON PARAMETROS  alt+shift+S+O -->eclipse

	public Puesto(String nomVen, String apellidoV) {
		this.nomVen = nomVen;
		this.apellidoV = apellidoV;
		nroProd=1;
		productos[1]="cebolla";precio[1]=45;
	}
	//Metodo mostrar
	public void mostrar(){
		System.out.println("Nombre: "+nomVen);
		System.out.println("Apellido: "+apellidoV);
		for (int i = 1; i <=nroProd; i++) {
			System.out.println(productos[i]+"\tPrecio :" +precio[i]);
		}
	}
	//Verificar si existe el producto X de un puesto 
	
	public boolean verificar(String x){
		for (int i = 1; i <= nroProd; i++) {
			if(productos[i].equals(x))
				return true;
		}
		return false;
	}
	// Atajo de teclado en eclise para los metodos GETTERS AND SETTERS alt+ shift +S+R
	public String getnombre(){
		return nomVen;
	}
	
	// Compara el nombre de dos objetos 
	public  boolean verificar2(Puesto p){
		if(this.nomVen.equals(p.getnombre()))
			return true;
	return false;
	}
	// Mostrar el mayor precio de un producto
	
	public int mayor(){
		int may=0;
		for (int i = 1; i <= nroProd; i++) {
			if(precio[i]>may)
				may=precio[i];
		}
		return may;
	}
	// Mostrar los productos que tengan los mayores precios 
	public void mayor2(){
		int may=mayor();
		for (int i = 1; i <= nroProd; i++) {
			if(precio[i]==may)
				System.out.println(productos[i]);
		}
	}
	//FORMA 2 --> mostrar los productos que tengan los mayores precios 
	public void mayorForma2(){
		int may=0;
		for (int i = 1; i <= nroProd; i++) {
			if(precio[i]>may)
				may=precio[i];
		}
		
		for (int i = 1; i <=nroProd; i++) {
			if(precio[i]==may)
				System.out.println(productos[i]);
		}
	}
}
