
public class Ej06IntercambioDeValores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Crea una nueva clase llamada Ej06, que contenga una llamada al método public static
			void main(String[] args). La aplicación Java contendrá comentarios descriptivos del código
			e intercambiará los valores de dos variables de tipo entero, haciendo uso de una tercera
			variable auxiliar. Antes de intercambiar los valores, debes declarar e inicializar las
			variables con los valores que tú quieras. Muestra los valores de las variables antes de
			intercambiar sus valores y después del intercambio.
		 * */
		
		int a=1;
		int b=2;
		int aux=0;
		
		System.out.println("La variable a vale-->"+a);
		System.out.println("la variable b vale-->"+b);
		
		aux=b;
		b=a;
		a=aux;
		
		System.err.println("despues del intercambio");
		System.out.println("La variable a vale-->"+a);
		System.out.println("la variable b vale-->"+b);
		
		
		
	}

}
