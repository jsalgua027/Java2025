package daw.utilidades;

import java.util.Random;

public class Aleatorios {
	 Random random = new Random();
	 
	/*
	 * Un método llamado enteroAleatorio(), que devuelva un entero aleatorio entre
       Integer.MAX_VALUE e Integer.MIN_VALUE.
     */ 
	public int enteroAleatorio() {
				        
	        return random.nextInt();
	}
	
	/*
	 * Un método llamado enteroRango(int min, int max) que devuelva un número entero
       aleatorio entre min y max, ambos incluidos. Min y max deben ser enteros positivos.
    */
	
	public int enteroRango(int min, int max) {
		 return random.nextInt((max - min) + 1) + min;
	}
	
	/*
	 * Un método llamado letraMinuscula(), que devuelva una letra minúscula entre ‘a’ y y
      ‘z’.
	 */
	
	public char letraMinuscula() {
		 int  numeroABC=enteroRango(97,122);
		 char letraAle= (char)numeroABC;
		 return letraAle;
	}
	
	/*. Un método llamado letraMayúscula(), que devuelva una letra mayúscula entre ‘A’ y
      y ‘Z’.
    */
	
	 public char letraMayuscula() {
	        int numeroABC = enteroRango(65, 90); // 'A' a 'Z'
	        char letraAle = (char) numeroABC;
	        return letraAle;
	    }

}
