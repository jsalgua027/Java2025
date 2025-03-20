import javax.swing.*;

public class EntradaDatos2 {

	public static void main(String[] args) {
		
		String nombre_usuario=JOptionPane.showInputDialog("Introduce tu nombre");
		//String edad =JOptionPane.showInputDialog("Introduce tu edad");
		int edad2 =Integer.parseInt(JOptionPane.showInputDialog("Introduce tu edad")); // La clase Integer para cambiar valores de texto a enteros  (es static, el nombre de la clase)
		double salario=Double.parseDouble(JOptionPane.showInputDialog("Introduce tu salario")); // la clase Double para de string para doubles

		System.out.println("Te llamas "+nombre_usuario +"y tienes "+ edad2+ " años y ganas al mes: "+salario);
	}

}
