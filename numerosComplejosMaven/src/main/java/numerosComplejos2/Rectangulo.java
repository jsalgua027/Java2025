package numerosComplejos2;

public class Rectangulo {
	
	private  PuntoGeometrico infIzq ;
	private PuntoGeometrico infDer;
	private PuntoGeometrico supIzq;
	private PuntoGeometrico supDer;
	
	
	public Rectangulo( PuntoGeometrico infDer, PuntoGeometrico supIzq, PuntoGeometrico supDer) {
		
		this.infIzq = new PuntoGeometrico(new Complejo(0,0));
		this.infDer = infDer;
		this.supIzq = supIzq;
		this.supDer = supDer;
	}
	
	public double superficie(){
		double res=0;
		
		return res;
	}
	
	
	
	public PuntoGeometrico getInfIzq() {
		return infIzq;
	}

	public PuntoGeometrico getInfDer() {
		return infDer;
	}

	public PuntoGeometrico getSupIzq() {
		return supIzq;
	}

	public PuntoGeometrico getSupDer() {
		return supDer;
	}

	public void setInfIzq(PuntoGeometrico infIzq) {
		this.infIzq = infIzq;
	}

	public void setInfDer(PuntoGeometrico infDer) {
		this.infDer = infDer;
	}

	public void setSupIzq(PuntoGeometrico supIzq) {
		this.supIzq = supIzq;
	}

	public void setSupDer(PuntoGeometrico supDer) {
		this.supDer = supDer;
	}

	/*
	 * public Rectangulo desplazamiento(int ejeX1,int ejeX2,int ejeY1,int ejeY2 ){
		Complejo aux1=new Complejo(ejeX1, ejeY1);
		Complejo aux2=new Complejo(ejeX2, ejeY2);
		
		this.infIzq.setCoordenada(aux1.setA(ejeX1),aux1.setB(ejeY1));
		
	}
	
	 * 
	 * */
	
	
	
	
	

}
