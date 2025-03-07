
public class Ej15 {

	public static void main(String[] args) {
		
		/*
		 * boolean adivina = ((97 == 'a') && true);
			System.out.println(adivina);
			
			b.- int a = 'a';
			System.out.println(a);
			
			c.- int pi = 3.14;
			System.out.println(pi)
		 * */
		
		//A
		boolean adivina = ((97 == 'a') && true);
		System.out.println(adivina);
		
		//B
		int a = 'a';
		System.out.println(a);
		
		//C
		//int pi = 3.14;  //es un duble en una variable entrea
		//System.out.println(pi);
		
		// comprobaciones 
		
		int b=8;
		int res=b++;
		int res1=++b;
		
		
		System.out.println("el resultado de b++ es: "+ res);
		System.out.println("el resultado de ++bb es: "+ res1);
		
		
		int c = 5;
		int result = c++ / 2; // La división se realiza con el valor actual de 'a' (5), luego 'a' se incrementa a 6
		System.out.println("Resultado: " + result); // Imprime 2
		System.out.println("Nuevo valor de c: " + c); // Imprime 6

		int z=5;
		int w=3;
		
		boolean prueba=z++/2<3 &&(z++/2>w || (z*5<w*4));
		
		System.out.println("el resultado de la prueba es :" + prueba);
		
		
	}

}
