/*
 * Created by SharpDevelop.
 * User: pc
 * Date: 29/9/2020
 * Time: 6:29 p. m.
 * 
 * To change this template use Tools | Options | Coding | Edit Standard Headers.
 */
using System;

namespace Sobrecarga_E1
{
	class Program
	{
		public static void Main(string[] args)
		{
			Veterinaria v= new Veterinaria();
			v.mostrar();
			Console.WriteLine("--------------------------a)--------------------");
			v--;
			Console.WriteLine("--------------------------b)--------------------");
			int x=v*"Napoleon";
			Console.WriteLine("--------------------------c)--------------------");
			v.mostrarD("Juan");
			Console.WriteLine("--------------------------d)--------------------");
			v.mostrarD(3);
			Console.ReadKey(true);
		}
	}
}