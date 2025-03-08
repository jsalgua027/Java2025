package Tema2Y3EstructurasControl;

import java.util.Scanner;

public class Eje06IfElseIf {

	public static void main(String[] args) {
		Scanner entradaDatos= new Scanner(System.in);
		int opcion;
		System.out.println("Menú de opciones");
		System.out.println("-------------------------");
		System.out.println("1. Calcular el área de un Cuadrado");
		System.out.println("2. Calcular el área de un Triángulo");
		System.out.println("3. Calcular el área de un Círculo");
		System.out.println("4. Finalizar");
		
		System.out.println("Elija una opción:");
		opcion=entradaDatos.nextInt();
		
		if(opcion==1) {
			System.out.println("Ha seleccionado calcular el área de un cuadrado...");
			System.out.println("indique el lado del cuadrado");
			int lado=entradaDatos.nextInt();
			double areaCuadrado=Math.pow(lado, 2);
			System.out.println("El area del cuadrado con lado:"+lado+" es de= "+ areaCuadrado);
			
		}else if(opcion==2) {
			System.out.println("Ha seleccionado calcular el área de un triángulo...");
			System.out.println("Indique la ALtura");
			double altura=entradaDatos.nextDouble();
			System.out.println("indique la base");
			double base=entradaDatos.nextDouble();
			double areaTriangulo=(base*altura)/2;
			System.out.println("El area del triangulo con base: "+base+" y altura: "+ altura+ "es de ="+areaTriangulo);

			
		}else if(opcion==3) {
			System.out.println("Ha seleccionado calcular el área de un círculo...");
			System.out.println("Indique el radio");
			double radio=entradaDatos.nextDouble();
			final double PI=3.1416;
			double areaCirculo=PI*Math.pow(radio,2);
			System.out.println("El area del círculo con el radio: "+radio+ " es de= "+areaCirculo);
			
		}else if(opcion==4) {
			System.out.println("Ha seleccionado terminar");
			
		}

	}

}
