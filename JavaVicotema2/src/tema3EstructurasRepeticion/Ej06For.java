package tema3EstructurasRepeticion;

import java.util.Iterator;
import java.util.Scanner;

public class Ej06For {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int n,x;
		System.out.print("Ingrese el valor final:");
		n=teclado.nextInt();
		x=1;
		
		for (int i = 0; i < n; i++) {
			System.out.print(x);
			System.out.print(" - ");
			//x=x+1  esto el lo mismo   sin pongo x++ creo un bucle infinito 
			x = ++x;
			
		}
	}

}
