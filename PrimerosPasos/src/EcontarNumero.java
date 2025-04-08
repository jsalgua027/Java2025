import java.util.Random;
import java.util.Scanner;

public class EcontarNumero {

	public static void main(String[] args) {
		 Random random = new Random();
		 Scanner entrada = new Scanner(System.in);
		/*  MI SOLUCION
		 * 
		 *  int max=100;
			 int min=1;
			 int aleatorio =random.nextInt((max - min) + 1) + min;
			 int numeroMarcado=101;
			 int contador=0;
			 System.out.println("el aleaotrio es:"+ aleatorio);
			 while (aleatorio!=numeroMarcado) {
				 System.out.println("Indique un número del 1 al 100");
				 numeroMarcado=entrada.nextInt();
				 contador++;
				 if(numeroMarcado>aleatorio) {
					 System.out.println("El número es más bajo");
				 }else if(numeroMarcado<aleatorio){
					 System.out.println("El número es más alto");
				 }
				
			}
		 	System.out.println("Felcidades ese es el número has necesitado "+ contador+ " intentos");
		 * 
		 * 
		 * 
		 * 
		 * */
		 
		 //solución profe
		 
		/*
		 *   int aleatorio=(int)(Math.random()*100)+1;  //multiplico para quitar los decimales hasta donde me interesa, le sumo 1 para que el rango sea entre 1 y 100 sino seria entre 0 y 99  OJO los parentesis
			 int intentos=0;
			 int numeroUsuario=0;
			 
			 while(aleatorio!=numeroUsuario){
				 System.out.println("Indique un número del 1 al 100");
				 numeroUsuario=entrada.nextInt();
				 intentos++;
				 if(numeroUsuario>aleatorio) {
					 System.out.println("El número es más bajo");
				 }else if(numeroUsuario<aleatorio){
					 System.out.println("El número es más alto");
				 }
				 
			 }
			 System.out.println("Felcidades ese es el número has necesitado "+ intentos+ " intentos");
		 * 
		 * */

		 // explicación do while  rango de valores entre 0 y 99
		 
		 int aleatorio=(int)(Math.random()*100);  //multiplico para quitar los decimales hasta donde me interesa, le sumo 1 para que el rango sea entre 1 y 100 sino seria entre 0 y 99  OJO los parentesis
		 int intentos=0;
		 int numeroUsuario=0;
		 
			do{
				 System.out.println("Indique un número del 1 al 100");
				 numeroUsuario=entrada.nextInt();
				 intentos++;
				 if(numeroUsuario>aleatorio) {
					 System.out.println("El número es más bajo");
				 }else if(numeroUsuario<aleatorio){
					 System.out.println("El número es más alto");
				 }
				 
			 }while(aleatorio!=numeroUsuario);
		 System.out.println("Felcidades ese es el número has necesitado "+ intentos+ " intentos");
		 
		 
		 
		 
	}

}
