package numerosComplejos2;

public class Prueba {

	public static void main(String[] args) {
		Complejo num1=new Complejo(5,6);
		Complejo num2=new Complejo(2,3);
		Complejo num3=new Complejo();
		int totalInstancias=Complejo.contadorInstancias();
		System.out.println("el número de instancias es--->"+totalInstancias);
		
	    Complejo suma=Complejo.sumar(num1,num2);
	    
	    System.out.println("la suma de los dos complejos es--->"+suma);
	    
	    Complejo restar =Complejo.restar(num1, num2);
	    
	    System.out.println("La resta de los dos complejos es--->"+restar);
	    
	    Complejo multiplicar=Complejo.multiplicar(num1, num2);
	    
	    System.out.println("La multiplicación de los dos complejos es---->"+ multiplicar);
	    
	    Complejo dividir = Complejo.dividir(num1, num1);
	    
	    System.out.println("la división de los complejos es--->"+dividir); // este resultado no es correcto dado que los atributos son int
	    
		totalInstancias=Complejo.contadorInstancias();
		System.out.println("el número de instancias despues de las operaciones es--->"+totalInstancias);

		
		//Zona de prueba del punto geométrico
		
		Complejo num4=new Complejo(8,7);
		Complejo num5=new Complejo(5,4);
		
		PuntoGeometrico a = new PuntoGeometrico(num4);
		PuntoGeometrico b = new PuntoGeometrico(num5);
		
		
		  System.out.println("Coordenada de a: " + a.getCoordenada());
		  System.out.println("Coordenada de b: " + b.getCoordenada());
		  
		  // Modificar las coordenadas usando setters
		    Complejo nuevaCoordenada = new Complejo(10, 15); // Crear un nuevo número complejo
		    a.setCoordenada(nuevaCoordenada);

		    System.out.println("Nueva coordenada de a: " + a.getCoordenada());
		    
		    int parteReal=a.getCoordenada().getA(); // accedo a la parte real de  punto geometrico a
		    System.out.println("La parte real del punto geométrico 'a' es: " + parteReal);
		
	}

}
