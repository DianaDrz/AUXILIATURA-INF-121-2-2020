/*
 * Created by SharpDevelop.
 * User: pc
 * Date: 29/9/2020
 * Time: 6:34 p. m.
 * 
 * To change this template use Tools | Options | Coding | Edit Standard Headers.
 */
using System;

namespace Sobrecarga_E1
{
	/// <summary>
	/// Description of Veterinaria.
	/// </summary>
	public class Veterinaria
	{
		private String nombreVeterinaria;
		private int nroAnimales,nroAtenciones;
		private String [,] dueñoMascota= new string[4,100];
		private String [,] atencion= new string[100,3];
		
		public Veterinaria()
		{
			nombreVeterinaria="Coquito";
			nroAnimales=3;
			dueñoMascota[1,1]="Juan";dueñoMascota[2,1]="Pelusa";dueñoMascota[3,1]="Gato";
			dueñoMascota[1,2]="Maria";dueñoMascota[2,2]="Matias";dueñoMascota[3,2]="Loro";
			dueñoMascota[1,3]="Luis";dueñoMascota[2,3]="Napoleon";dueñoMascota[3,3]="Perro";
			nroAtenciones=4;
			atencion[1,1]="2";atencion[1,2]="Resfrio";
			atencion[2,1]="3";atencion[2,2]="Vacuna antirrabica";
			atencion[3,1]="1";atencion[3,2]="Corte de uñas";
			atencion[4,1]="3";atencion[4,2]="Limpieza de dientes";
		}
		
		public void mostrar(){
			Console.WriteLine("Nombre Veterinaria: "+nombreVeterinaria);
			for(int i=1;i<=nroAnimales;i++){
				Console.WriteLine(dueñoMascota[1,i]+" "+dueñoMascota[2,i]+" "+dueñoMascota[3,i]);
			}
			for(int j=1;j<=nroAtenciones;j++){
				Console.WriteLine(atencion[j,1]+" "+atencion[j,2]);
			}
		}
		//SOBRECARGA DE OPERADORES
		//a)Mostrar de cada mascota sus atenciones 
		public static Veterinaria operator --(Veterinaria v){
			
			for(int i=1;i<=v.nroAnimales;i++){
				for(int j=1;j<=v.nroAtenciones;j++){
					if(i==int.Parse(v.atencion[j,1]))
						Console.WriteLine("Nombre de la mascota: "+v.dueñoMascota[2,i]+"  Atencion: "+v.atencion[j,2]);
				}
			}
			return v;
		}
		//Cuantas veces se atendio a la mascota con NOMBRE X
		public static int operator *(Veterinaria v,String x){
			int contador=0;
			for(int i=1;i<=v.nroAnimales;i++){
				if(v.dueñoMascota[2,i].Equals(x)){
					for(int j=1;j<=v.nroAtenciones;j++){
						if(i==int.Parse(v.atencion[j,1]))
							contador=contador+1;
					}
				}
			}
			Console.WriteLine("Cantidad de veces que fue atendido:"+contador);
			return 0;
		}
		//c)Cuantas mascotas tiene el dueño con NOMBRE X
		public void mostrarD(String x){
			int contar=0;
			for(int i=1;i<=nroAnimales;i++){
				if(dueñoMascota[1,i].Equals(x))
					contar=contar+1;
			}
			Console.WriteLine(x+" tiene " +contar+" mascotas ");
		}
		//Mostrar al i-esimo dueño y su mascota y las atenciones que tuvo esa mascota
		public void mostrarD(int i ){
			Console.WriteLine("Dueño: "+dueñoMascota[1,i]);
			Console.WriteLine("Nombre de la mascota: "+dueñoMascota[2,i]);
			for(int j=1;j<=nroAtenciones;j++){
				if(i==int.Parse(atencion[j,1]))
					Console.WriteLine("Atencion: "+atencion[j,2]);
			}
		}
	}
}
