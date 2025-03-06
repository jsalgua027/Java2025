
public class Ej10Boolean2 {

	public static void main(String[] args) {
	
		/*
		 *  Crea una nueva clase llamada Ej10, que contenga una llamada al método public
			static void main(String[] args). La aplicación Java contendrá comentarios descriptivos del
			código y realizará lo siguiente:
			a.- Declara e inicializa dos variables lógicas, una se llamará verdadero y valdrá
			true, la otra falso y valdrá false.
			b.- Muestra las tablas de verdad de las operaciones lógicas && (AND) y || (OR),
			usando las variables verdadero y falso.
			c.- Muestra en pantalla el resultado de las operaciones !verdadero y !falso.
		 * 
		 * 
		 * */
		
	    boolean verdadero = true;
        boolean falso = false;

        // Tabla de verdad para &&
        System.out.println("verdadero && verdadero: " + (verdadero && verdadero));
        System.out.println("verdadero && falso: " + (verdadero && falso));
        System.out.println("falso && verdadero: " + (falso && verdadero));
        System.out.println("falso && falso: " + (falso && falso));

        // Tabla de verdad para ||
        System.out.println("verdadero || verdadero: " + (verdadero || verdadero));
        System.out.println("verdadero || falso: " + (verdadero || falso));
        System.out.println("falso || verdadero: " + (falso || verdadero));
        System.out.println("falso || falso: " + (falso || falso));
		
        

        // Mostrar los resultados de las negaciones
        System.out.println("!verdadero: " + !verdadero);
        System.out.println("!falso: " + !falso);

	}

}
