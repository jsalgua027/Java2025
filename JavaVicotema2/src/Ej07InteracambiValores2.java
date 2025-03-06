
public class Ej07InteracambiValores2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		* - Crea una nueva clase llamada Ej07, que contenga una llamada al método public static
			void main(String[] args). La aplicación Java contendrá comentarios descriptivos del código
			y realiza lo siguiente:
			a.- Declara e inicializa tres variables int en la misma instrucción (a=1, b=2, c=3).
			.- Declara e inicializa tres variables double en la misma instrucción (d=4.5, e=5.7,
			f=6.9).
			c.- Muestra las variables en dos líneas, la primera línea mostrará las variables tipo
			entero y la segunda línea mostrará las variables tipo double.
			d.- Realiza los siguiente intercambios de valores: en b guarda c, en c guarda a, en
			a guarda b. Muestra por pantalla el resultado.
			e.- Realiza los siguiente intercambios de valores: en e guarda f, en f guarda d, en d
			guarda e. Muestra por pantalla el resultado.
		 * */

		//A
		int a=1,b=2,c=3;
		double d=4.5, e=5.7, f=6.9;
        
		//C
		
		System.out.println("las variables enteras son--> a="+a+" b="+b+" c="+c);
		System.out.println("la variables double son--> d="+d+" e="+e+" f="+f);
		
		//D
		System.out.println("realizo el intercambio según ejercicio");
		b=c;
		c=a;
		a=b;
	
		System.out.println("las variables enteras son--> a="+a+" b="+b+" c="+c);
		
		//E
		e=f;
		f=d;
		d=e;
		System.out.println("la variables double son--> d="+d+" e="+e+" f="+f);
		
		
	}

}
