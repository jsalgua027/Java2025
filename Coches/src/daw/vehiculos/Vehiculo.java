package daw.vehiculos;

public class Vehiculo {
	private String matricula;
	private String marca;
	private String modelo;
	private String color;
	private double tarifa;
	private boolean disponible;
	
	public Vehiculo(String matricula, String marca, String modelo, String color, double tarifa) {
		
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.tarifa = tarifa;
		this.disponible = false;
	}

	public String getMatricula() {
		return this.matricula;
		} 
	
	public String getMarca() {
		return this.marca;
		}
	
	public String getModelo() {
		return this.modelo;
		} 
	
	public String getColor() {
		return this.color;
		}
	
	public double getTarifa() {
		return this.tarifa;
		}
	
	public boolean getDisponible() {
		return this.disponible;
		}
	
	public void setTarifa(double tarifa) {
		this.tarifa = tarifa;
		}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
		}

	@Override
	public String toString() {
		return "Vehiculo [matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", color=" + color
				+ ", tarifa=" + tarifa + ", disponible=" + disponible + "]";
	} 
	
	
	

}
