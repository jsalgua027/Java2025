
public class Ej05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
		  * En un nuevo proyecto, llamado Tema2+tunombre, crea una nueva clase llamada Ej05,
			que contenga una llamada al método public static void main(String[] args). La aplicación
			Java contendrá comentarios descriptivos del código y realiza lo siguiente:
			a.- Declara una variable primitiva de cada uno de los tipos estudiados.
			b.- Declara una constante numérica de tipo double y otra de tipo int. Presta
			especial atención a la hora de poner el nombre de estas constantes y usa el modificador
			final.
			c.- Declara un objeto String.
			d.- Inicializa las variables, la constante y el objeto con literales de tu elección.
			e.- Muestra en pantalla cada una de las variables, constantes y objetos anteriores,
			en distintas líneas y especificando el tamaño que ocupan en memoria, según la tabla que
			hay en los apuntes (paǵ 7).
		 * 
		 * 
		 * */

		//A
		short num=1;
		byte num1=2;
		int num2=3;
		long num3=456l; // ojo la l al final 
		
	    double  num4=5.666654;
	    float num5=3.14159f; //ojo la f al final 
	    
	    char caracter='a';
	    //B
	    boolean verdadero= true;
	    boolean falso = false;
	    
	    final double NUMERO=25.23;
	    final int NUMERO1=3;
	    
	    //C
	    
	    String palabra="maria";
	    
	    //D
	    //las he inicializado antes
	    
	    System.out.println("byte - 8 bits Entero con signo -128 a 127-->"+ num1);
	    System.out.println("Short – 16 bits Entero con signo -32768 a 32767-->"+num);
	    System.out.println("Int – 32 bits Entero con signo -2147483648 a 2147483647-->"+num2);
	    System.out.println("Long – 64 bits Entero con signo\r\n"
	    		+ "-922117036854775808L a\r\n"
	    		+ "+922117036854775807L-->"+num3);
	    System.out.println("Float – 32 bits Real de precisión simple\r\n"
	    		+ "±3.40282347e+38F a\r\n"
	    		+ "±1.40239846e-45F-->"+num5);
	    System.out.println("Double – 64 bits Real de precisión doble\r\n"
	    		+ "±1.7976931348623157e+309 a\r\n"
	    		+ "±4.94065645841246544e-324-->"+num4);
	    System.out.println("char - 16 bits Caracteres Unicode \\u0000 a \\uFFFF-->"+caracter);
	    System.out.println("boolean - 1 bit Valores lógicos true, false--->"+verdadero+" y "+ falso);
	    
	    
	    
		
		
		
		
		
		
	}

}
