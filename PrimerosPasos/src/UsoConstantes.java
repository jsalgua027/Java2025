import java.util.Objects;

public class UsoConstantes {
	
	//constante de clase
	
	private static final double NUMEROCON=3.1416;  //en mayuscula

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 final int ejemplo=9;  // se puede inicializar en otra linea pero las de clase tienen que estar inicializadas en la misma linea
		 
		System.out.println(ejemplo);
		
		// comprobaciòn de tipo de una variables
		
		
		System.out.println("*******Cmporobación de tipo d variable*********");
		byte numero=1;
		
			System.out.println(((Object)numero).getClass().getSimpleName());
		
			
		
	}

}
