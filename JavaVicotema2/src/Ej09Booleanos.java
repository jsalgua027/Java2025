
public class Ej09Booleanos {

	public static void main(String[] args) {
		/*
		 * 
		 * Crea una nueva clase llamada Ej09, que contenga una llamada al método public static
			void main(String[] args). La aplicación Java contendrá comentarios descriptivos del código
			y realizará lo siguiente:
			a.- Declara e inicializa dos variables int (a=10, b=20).
			b.- Declara cuatro variables booleanas.
			c.- Guarda, en las variables booleanas, el resultado de realizar las siguientes
			operaciones relacionales: a<b, a>b, a==b, a!=b.
			d.- Muestra en pantalla el resultado de las operaciones, usando las variables
			booleanas.
         */

		//A
		int a=10,b=20;
		//B
		boolean res1,res2,res3,res4;
		//C
		res1=a<b;
		res2=a>b;
		res3=a==b;
		res4=a!=b;
		//D
		
		System.out.println("El resultado booleano es-->"+res1);
		System.out.println("El resultado booleano es-->"+res2);
		System.out.println("El resultado booleano es-->"+res3);
		System.out.println("El resultado booleano es-->"+res4);
		
		
	}

}
