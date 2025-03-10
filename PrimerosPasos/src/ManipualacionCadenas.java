
public class ManipualacionCadenas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombre="Nacho";
		
		int numeroDeLetras=nombre.length();
		
		System.out.println("El número de letras es :" +numeroDeLetras);
		
		
		//método charAt()
		
		 System.out.println("la primera letra de mi nombre es: "+ nombre.charAt(0));
		 
		 System.out.println("la última letra de mi nombre es: "+ nombre.charAt(4));

		 
		 //ejercicio básico dame el último catracter de cualquier palabra
		 
		 String palabra="vaciones";
		 String palabra1="esternocleidomastoido";
		 String palabra2="limón";
		 
		 System.out.println("El último carcater de la palabra es: "+palabra.charAt(palabra.length()-1));
		 System.out.println("El último carcater de la palabra es: "+palabra1.charAt(palabra1.length()-1));
		 System.out.println("El último carcater de la palabra es: "+palabra2.charAt(palabra2.length()-1));
		 
		 
		 //método subString  para extraer partes del texto;
		 
		 String frase="Hoy es un estupendo día para aprender java";
		 
		 String subCadena=frase.substring(4,6); // dos parametros
		 
		 String subCadena2=frase.substring(4); // un parametro
		 System.out.println("Lo que obtenemos---> "+subCadena);
		 System.out.println(subCadena2);
		 
		 // método de comparacion
		 
		 String alumno1="pepe";
		 String alumno2="pepe";
		 String alumno3="Pepe";
		 
		 System.out.println("son iguales?--->"+ alumno1.equals(alumno2));
		 System.out.println("son iguales?--->"+ alumno1.equals(alumno3));// ojo con las mayusculas
		 System.out.println("son iguales?--->"+ alumno1.equalsIgnoreCase(alumno3)); // ignora las mayusculas
		 
		 
		
		 

	}

}
