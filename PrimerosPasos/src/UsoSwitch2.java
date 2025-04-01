
import java.util.Scanner;

public class UsoSwitch2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Indica el nombre del día de la semana");
		String diaSemana = entrada.nextLine();
		
		//*********NOVEDADES SWITCH*********

		/*
		 * 
		 *    String resultado = switch (diaSemana) {
	
				case "Lunes" -> "laborable";
				case "Martes" -> "laborable";
				case "Miercoles" -> "laborable";
				case "Jueves" -> "laborable";
				case "Viernes" -> "laborable";
				case "Sábado" -> "festivo";
				case "Domingo" -> "festivo";
				default -> "Día no valido";
				
			};
		 * 
		 * 
		 * */
		
		//NOVEDAD: Podemos agrupar valores 
		
		String resultado = switch (diaSemana) {

		case "Lunes","Martes","Miercoles","Jueves","Viernes" -> "laborable";
	
		case "Sábado","Domingo" -> "festivo";
		
		default ->{// esto todo es lo nuevo tambien 
			System.out.println("Procesando.......");
			 yield "Día no valido";
			}
		
		};

		System.out.println("El día es: " + resultado);

	}

}
