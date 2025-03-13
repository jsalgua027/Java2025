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

	}

}
