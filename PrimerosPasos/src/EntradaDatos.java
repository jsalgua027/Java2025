import java.util.Scanner;

public class EntradaDatos {

	public static void main(String[] args) {
	Scanner entrada=new Scanner(System.in);
	
    System.out.println("introduce tu nombre");
    
    String nombre_usuario=entrada.nextLine();
    
    System.out.println("introduce tu edad");
    
    int edad=entrada.nextInt();
    
    System.out.println("hola  "+nombre_usuario+" y tiene "+ edad+ " años");
	 
    entrada.close();// cierro el Scanner, dejo de consumir los recursos. 

	}

}
