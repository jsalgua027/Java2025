package numerosReales;

public class Racional {
	private int numerador;
	private int denominador;
	
	
	public Racional(int numerador, int denominador) {
		if(denominador==0){
			throw new IllegalArgumentException("El denominador no puede ser cero");
		}
		this.numerador = numerador;
		this.denominador = denominador;
	}
	
	public Racional() {
		
	}



	public int getNumerador() {
		return numerador;
	}


	public int getDenominador() {
		return denominador;
	}


	public void setNumerador(int numerador) {
		this.numerador = numerador;
	}


	public void setDenominador(int denominador) {
		if(denominador==0){
			throw new IllegalArgumentException("El denominador no puede ser cero");
		}
		this.denominador = denominador;
	}


	@Override
	public String toString() {
		return "Racional [numerador=" + numerador + ", denominador=" + denominador + "]";
	}
	
	
	

}
