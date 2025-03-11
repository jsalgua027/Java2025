package daw.poo;

public class CajaCarton {
 private double ancho;//milímetros
 private double alto;//milímetros
 private double largo;//milímetros
 private double peso;//gramos
public CajaCarton(double ancho, double alto, double largo, double peso) {
	this.ancho = ancho;
	this.alto = alto;
	this.largo = largo;
	this.peso = peso;
}

public CajaCarton() {
	
}
public double getAncho() {
	return ancho;
}
public void setAncho(double ancho) {
	this.ancho = ancho;
}
public double getAlto() {
	return alto;
}
public void setAlto(double alto) {
	this.alto = alto;
}
public double getLargo() {
	return largo;
}
public void setLargo(double largo) {
	this.largo = largo;
}
public double getPeso() {
	return peso;
}
public void setPeso(double peso) {
	this.peso = peso;
}

public void abrir() {
	
}

public void cerrar() {
	
}


 
 
 
}
