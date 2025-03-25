
import java.util.Random;
import java.util.HashSet;
import java.util.Set;

public class Prueba {

	public static void main(String[] args) {
		int ancho = 5;
		int alto = 10;
		Random alea = new Random();
		int max = 99;
		int min = 10;
		Set<Integer> numerosUsados = new HashSet<>();

		for (int i = 0; i <= alto; i++) {
			System.out.println();
			for (int j = 0; j <= ancho; j++) {
				int num;
				do {
					num = alea.nextInt((max - min) + 1) + min;
				} while (numerosUsados.contains(num)); // Repetimos hasta obtener un número único

				numerosUsados.add(num); // Agregamos el número al conjunto
				System.out.print("|" + num + "|");

			}

		}

	}

}
