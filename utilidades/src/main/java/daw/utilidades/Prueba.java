package daw.utilidades;

public class Prueba {

	public static void main(String[] args) {

		Aleatorios prueba= new Aleatorios();
		
		int res=prueba.enteroAleatorio();
		
		System.out.println(res);
		
		int conRango=prueba.enteroRango(1, 10);
		
		System.out.println("entre el 1 y el 10----->"+conRango);
		
		char minuscula=prueba.letraMinuscula();
		
		System.out.println("la letra minúscula aleatoria es---->"+minuscula);
		
		char mayuscula=prueba.letraMayuscula();
		
		System.out.println("la letra mayúscula aleatoria es---->"+mayuscula);
		
      

	}

}
