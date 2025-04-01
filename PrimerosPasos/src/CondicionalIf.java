import java.util.Scanner;

public class CondicionalIf {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce tu edad");
		int edad=entrada.nextInt();
		
		/*   IF ELSE simple
		 * 
	     *  if(edad>=18) {
				System.out.println("Eres mayor de edad");
			}else {
				System.out.println("Eres menor de edad");
			}
		
		 * 
		 * */

		if(edad<=18) {
			System.out.println("eres muy joven");
		}
		else if(edad<=35) {
			System.out.println("eres joven");
		}
		else if(edad<=60) {
			System.out.println("eres maduro");
			
		}
		else if(edad <=90) {
			System.out.println("cuidate");
		}
		else {
			System.out.println("Dónde vas con esa edad");
		}
	//	entrada.close(); //cierro y libero los recursos; OJO ya no puedo usarlo otra vez pq lo he cerrado; OJO cerramos el System.in y no lo podemos usar otra vez. Podemos hacer otras entradas como una lectura de un fichero
		

				
		
	}
	

}
