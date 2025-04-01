import javax.swing.JOptionPane;

public class UsoWhile {

	public static void main(String[] args) {
		String claveCorrecta="Lunes";
		String password="";
		
		while (claveCorrecta.equals(password)==false) {
			password=JOptionPane.showInputDialog("Introduce la contraseña");
			
			if(claveCorrecta.equals(password)==false) System.out.println("la contraseña no es correcta");
						
		}
		System.out.println("la contraseña es correcta");

	}

}
