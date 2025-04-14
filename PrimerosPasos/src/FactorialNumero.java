import java.util.Iterator;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class FactorialNumero {

	public static void main(String[] args) {
		// OJO con un INT es muy facil desbordarlo.  habría que usar la clase BigInteger
		
		Scanner entrada= new Scanner(System.in);
		System.out.println("Introduce un número y te doy su factorial");
		int factorial=1;
		int numero=entrada.nextInt();
	    for (int i = numero; i>0; i--) {
	    	
	    	factorial=factorial*i;
			
		}
       System.out.println("El factorial del número: "+numero+ " es " +factorial);

	 
	    
	    
	}

}
