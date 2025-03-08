package Tema2Y3EstructurasControl;

import java.util.Scanner;

public class Eje02Ternario {

	public static void main(String[] args) {
	/*
	 *  a)Si el número “x” es mayor o igual que 135 se devolverá “mayor”, si es menor se
		devolverá “menor”. Las cadenas que se devuelven se guardarán en una variable
		llamada resultado.
		b) Si el número “x” es menor o igual que cero se imprimirá en pantalla “Menor que
		cero”, si no se imprimirá “Mayor que cero”.
		c) Guardar el valor absoluto de un número entero en una variable entera (sin usar la
		función Math.abs())
	 * 
	 * */

		  Scanner entraDatos= new Scanner(System.in);
		  System.out.println("introduce un número");
		  int x=entraDatos.nextInt();
		  
		  String resultado= x>135?"mayor":"menor";
		  String resultado1=x<=0?"menor que cero":"Mayor que cero";
		  
		
		  System.out.println(resultado);
		  System.out.println(resultado1);
		  
		  
		  // número absoluto si usar Math.abs
		  
		  System.out.println("dame una cifra y te doy el absoluto");
		  int num=entraDatos.nextInt();
		  int valorAbsoluto;
		  if(num<0){
			  valorAbsoluto=-num;
		  }else {
			  valorAbsoluto=num;
			 
		  }
		  
		  System.out.println("El valor absoluto del número indicado es= "+ valorAbsoluto);
		  
		  
		  
		  
		  
		  
		  
		
		
		
	}

}
