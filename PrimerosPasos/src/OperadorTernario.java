import java.util.Scanner;

public class OperadorTernario {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Introduce tu edad");
		int edad = entrada.nextInt();
		
		String resultado=(edad>18) ? "eres mayor de edad":"eres menor de edad";
		System.out.println(resultado);

	}

}
