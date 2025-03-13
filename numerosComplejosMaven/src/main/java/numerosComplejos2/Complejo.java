package numerosComplejos2;

public class Complejo {

	private int a;
	private int b;
	
	 // Contador de instancias de la clase Complejo
    private static int contadorInstancias = 0;
	
	public Complejo(int a, int b) {
		
		this.a = a;
		this.b = b;
		
		contadorInstancias++;
	}
	
	
	public Complejo() {
		  contadorInstancias++;
	}


	public int getA() {
		return a;
	}


	public int getB() {
		return b;
	}


	public void setA(int a) {
		this.a = a;
	}


	public void setB(int b) {
		this.b = b;
	}


	@Override
	public String toString() {
		return "Complejo [a=" + a + ", b=" + b + "]";
	}
	
	 // Método para sumar dos números complejos
    public static Complejo sumar(Complejo complejo1, Complejo complejo2) {
        // Suma las partes reales y las imaginarias
        int totalA = complejo1.a + complejo2.a;
        int totalB = complejo1.b + complejo2.b;

        // Retorna un nuevo objeto Complejo con el resultado de la suma
        return new Complejo(totalA, totalB);
    }
	
    public static Complejo restar(Complejo complejo1, Complejo complejo2) {
        // Resta las partes reales y las imaginarias
        int totalA = complejo1.a - complejo2.a;
        int totalB = complejo1.b - complejo2.b;

        // Retorna un nuevo objeto Complejo con el resultado de la resta
        return new Complejo(totalA, totalB);
    }
    
    //(a+bi)(c+di)=(ac−bd)+(ad+bc)i
    public static Complejo multiplicar(Complejo complejo1, Complejo complejo2) {
    	
    	  // Parte real: ac - bd
        int parteReal = complejo1.a * complejo2.a - complejo1.b * complejo2.b;

        // Parte imaginaria: ad + bc
        int parteImaginaria = complejo1.a * complejo2.b + complejo1.b * complejo2.a;

    
        return new Complejo(parteReal, parteImaginaria);
    	
    }
    
    //dividir
    public static Complejo dividir(Complejo complejo1, Complejo complejo2) {
        // Denominador (c^2 + d^2)
        int denominador = complejo2.a * complejo2.a + complejo2.b * complejo2.b;

        // Parte real: (ac + bd) / (c^2 + d^2)
        int parteReal = (complejo1.a * complejo2.a + complejo1.b * complejo2.b) / denominador;

        // Parte imaginaria: (bc - ad) / (c^2 + d^2)
        int parteImaginaria = (complejo1.b * complejo2.a - complejo1.a * complejo2.b) / denominador;

        // Retorna el resultado de la división
        return new Complejo(parteReal, parteImaginaria);
    }
    
    //igualdad
    public boolean esIgual(Complejo otro) {
        // Compara tanto la parte real como la parte imaginaria
        return this.a == otro.a && this.b == otro.b;
    }
    
    // Método para obtener la cantidad de instancias creadas
    public static int contadorInstancias() {
        return contadorInstancias;
    }

		
}
	
	

