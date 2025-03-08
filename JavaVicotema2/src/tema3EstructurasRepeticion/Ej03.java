package tema3EstructurasRepeticion;

import java.awt.Container;

public class Ej03 {

	public static void main(String[] args) {
		// Realizar un programa que imprima 25 términos de la serie 15 - 30 - 60 - 120, etc. No
		//se introducen valores por teclado

		int totalTerminos= 25;
		int contador=1;
		int num=15;
		
		while (contador<=totalTerminos) {
			
			System.out.println(num);
			System.out.println(" - ");
			contador=contador+1;
			num=num*2;
			
		}
		
		
		
	}

}
