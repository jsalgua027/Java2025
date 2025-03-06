import java.util.Scanner;

public class Ej14ClaseScanner {

	public static void main(String[] args) {
         /*
          * Crea una nueva clase llamada Ej14, que contenga una llamada al método public
			static void main(String[] args). El programa tendrá una variable entera tiempo inicializada
			con un valor leído por teclado, en segundos, y queremos conocer este tiempo pero
			expresado en horas, minutos y segundos, mostrando los resultados por pantalla
          * 
          * */

	 Scanner entradaTeclado = new Scanner(System.in);
	 
	 System.out.println("Introduce el tiempo");
	 int tiempo=entradaTeclado.nextInt();
	
     // Calcular horas, minutos y segundos
     int horas = tiempo / 3600;
     int minutos = (tiempo % 3600) / 60;
     int segundos = tiempo % 60;
     
     //otra forma más sencilla de verlo
     int horas1 = tiempo / 3600;
     int segundosRestantes = tiempo % 3600;
     int minutos1 = segundosRestantes / 60;
     int segundos1 = segundosRestantes % 60;

     // Mostrar el resultado
     System.out.println("El tiempo es: " + horas + " horas, " + minutos + " minutos y " + segundos + " segundos.");
     
     System.out.println("El tiempo es: " + horas1 + " horas, " + minutos1 + " minutos y " + segundos1 + " segundos.");
		
	}

}
