import java.util.Random;
import java.util.Scanner;

public class EcontarNumero {

	public static void main(String[] args) {
		 Random random = new Random();
		 Scanner entrada = new Scanner(System.in);
		 int max=100;
		 int min=0;
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
		 

	}

}
