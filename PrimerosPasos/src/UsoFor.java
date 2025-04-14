import javax.swing.JOptionPane;

public class UsoFor {

	public static void main(String[] args) {
		
		String mail=JOptionPane.showInputDialog("introduce email");
		boolean arroba=false;
		int contadorArroba=0;
		int contadorPuntos=0;
		
		for (int i = 0; i < mail.length(); i++) {
			if(mail.charAt(i)=='@') {
				contadorArroba++;
			}
			if(mail.charAt(i)=='.') {
				contadorPuntos++;
			}
		}
		
		if(contadorArroba==1 && contadorPuntos==1){
			System.out.println("Mail correcto");
		}else {
			System.out.println("Mail incorrecto");
		}

	}

}
