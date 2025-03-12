package daw.poo;

public class TestCajaCarton {

	public static void main(String[] args) {
		
		//declaro los objetos
		CajaCarton  cajaGrande;
		CajaCarton  cajaChica;
		//Instacio los objetos
		  cajaGrande=new CajaCarton(250,400,500,200);
		  cajaChica= new CajaCarton(25,30,15,17);
		//muestro los datos de las cajas
		  
		 System.out.println("El ancho de la caja grande es--->"+ cajaGrande.getAncho()+"mm");
		 System.out.println("El alto de la caja grande es--->"+ cajaGrande.getAlto()+"mm");
		 System.out.println("El largo de la caja grande es--->"+ cajaGrande.getLargo()+"mm");
		 System.out.println("El peso de la caja grande es--->"+ cajaGrande.getPeso()+"g");
		 
		 System.out.println("El ancho de la caja chica es--->"+ cajaChica.getAncho()+"mm");
		 System.out.println("El alto de la caja  chica es--->"+ cajaChica.getAlto()+"mm");
		 System.out.println("El largo de la caja chica es--->"+ cajaChica.getLargo()+"mm");
		 System.out.println("El peso de la caja chica es--->"+ cajaChica.getPeso()+"g");
		  
  //ejercicio 11 Relación B
		 cajaChica.setPeso(1200);
		 
		 System.out.println("el peso de la caja chica es--->"+cajaChica.getPeso());
		 
		/**
		 *  //asi si es público el atributo
		 cajaChica.peso=500;
		 */
		 
		 
	}

}
