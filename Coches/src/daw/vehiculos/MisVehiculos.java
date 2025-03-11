package daw.vehiculos;

public class MisVehiculos {

	public static void main(String[] args) {
		
		Vehiculo miCacharro = new Vehiculo("5545CWX", "ALFAROMEO", "147", "AZUL", 18000);
		
		System.out.println("----------Usando el método toString");
		System.out.println(miCacharro.toString());
		System.out.println("----------Usando los getters");
		System.out.println("La matrícula es----> "+miCacharro.getMatricula());
		System.out.println("La marca es----> "+miCacharro.getMarca());
		System.out.println("El modelo  es----> "+miCacharro.getModelo());
		System.out.println("El color  es----> "+miCacharro.getColor());
		System.out.println("Su precio  es----> "+miCacharro.getTarifa());
		
		
		
		
		
	}

}
