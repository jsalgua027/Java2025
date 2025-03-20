import java.util.Scanner;

public class EntradaDatos {

	public static void main(String[] args) {

		/*
		 * System.out.println("introduce tu nombre");
		 * 
		 * String nombre_usuario=entrada.nextLine();
		 * 
		 * System.out.println("introduce tu edad");
		 * 
		 * int edad=entrada.nextInt();
		 * 
		 * System.out.println("hola  "+nombre_usuario+" y tiene "+ edad+ " años");
		 * 
		 * entrada.close();// cierro el Scanner, dejo de consumir los recursos.
		 * 
		 */
		Scanner entrada = new Scanner(System.in);

		System.out.println("introduce tu edad");

		int edad = entrada.nextInt();
		entrada.nextLine(); // !!! OJO si usamos la entrada de datos con el nextInt tenemos que realizar el
							// salto de linea sino no funciona correctamente

		System.out.println("introduce tu nombre");

		String nombre_usuario = entrada.nextLine();

		System.out.println("hola  " + nombre_usuario + " y tiene " + edad + " años");

		entrada.close();// cierro el Scanner, dejo de consumir los recursos.

	}

}
