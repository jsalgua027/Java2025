package numerosComplejos2;

public class PuntoGeometrico {
	
	private Complejo coordenada;

	public PuntoGeometrico(Complejo coordenada) {
		
		this.coordenada = coordenada;
	}
	
public PuntoGeometrico() {
				
	}

public Complejo getCoordenada() {
	return coordenada;
}

public void setCoordenada(Complejo coordenada) {
	this.coordenada = coordenada;
}

@Override
public String toString() {
	return "PuntoGeometrico [coordenada=" + coordenada + "]";
}
	
	
	
	
	

}
