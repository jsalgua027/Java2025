import java.awt.geom.GeneralPath;

import javax.swing.JOptionPane;

public class PesoIdeal {

	public static void main(String[] args) {
		String alturaStrinng=JOptionPane.showInputDialog("Introduce tú altura en centimetros");
	    int altura=Integer.parseInt(alturaStrinng);
	   	boolean bien=true;
	    do {
	    	
	    	 String genero=JOptionPane.showInputDialog("Introduce el genero m para mujeres y h para hombres");
	    		    	 
	    	 if(genero.equalsIgnoreCase("m")){
	    		 int resultado=altura-120;
	    		 JOptionPane.showMessageDialog(null, "El peso ideal para esa altura es: "+ resultado);
	    		 bien=false;
	    	 }else if(genero.equalsIgnoreCase("h")){
	    		 int resultado=altura-110;
	    		 JOptionPane.showMessageDialog(null, "El peso ideal para esa altura es: "+ resultado);
	    		 bien=false;
	    	 }else {
	    		 JOptionPane.showMessageDialog(null, "EL genero indicado es erroneo");
	    		 bien=true;
	    	 }
	    	
			
		} while (bien!=false);
	    
	    
	}

}
