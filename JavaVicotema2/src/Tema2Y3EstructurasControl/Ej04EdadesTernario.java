package Tema2Y3EstructurasControl;

import java.util.Scanner;

public class Ej04EdadesTernario {

	public static void main(String[] args) {
		
		Scanner entradaDatos= new Scanner(System.in);
		
		System.out.println("Introduce una edad");
		int edad=entradaDatos.nextInt();
		
		String resultado=edad>18?"es mayor de edad":"es menor de edad";
		
		System.out.println(resultado);
		

	}

}
