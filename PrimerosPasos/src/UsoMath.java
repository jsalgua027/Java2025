
public class UsoMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//hay que hacer casting pq si miras la ApI de java el devuleve un double y quiero un entero.
		//el método recibe un double pero java hace la conversión implicita. 
			
		
		int raiz=(int) Math.sqrt(9);
		System.out.println(raiz);
		
		double raiz2= Math.sqrt(9);
		System.out.println(raiz2);
		
		// elevar a un número. ojo con los devordamientos y el tipo que usamos pq podemos falsear valores
		
		int potencia=(int)Math.pow(5, 3);
		
		System.out.println("cinco elevado a 3 es = "+ potencia);
				
		
		// números aleatorios 
		
		double aleatorio =Math.random();
		
		System.out.println("el aleatorio entre 0 y 1 es: "+aleatorio);
		
		// números aleatorios usando el redondeo ojo con los tipos 
		
		int aleatorio2=Math.round((float)(Math.random()*100));
		
		System.out.println("el aleatorio2 entre 0 y 100 es: "+aleatorio2);
		
		// valor absoluto; nos devuelve el numero sin ser negativo o positivo
		
		int absoluto=Math.abs(-45);
		
		System.out.println("el valor absoluto es: "+ absoluto);
		
	
		
		// método el max, nos devuleve el valor más grande de dos valores 
		
		int mayor=Math.max(5, 9);
		
		System.out.println("el valor mayor entre 5 y 9 es: " + mayor);
		
	//*********aleatorios dentro de un rango **********
		
		System.out.println("**********Aleatorios dentro de un rango*******");
		
		//alearios entre un 0 y 100 --> 100 excluido 
		
		int aleExcluido=(int)(Math.random()*100);
		
		System.out.println("el número ale entre 0 y 99 es: "+ aleExcluido);
		
		//aleatorio dentro de un rango siendo el mayor excluido 
		
		int min=2;
		int max=25;
		
		int aleRangoExcluido=((int)(Math.random()*(max-min+1)-min));  
		
		int aleRangoExcluidoLosDos = (int)(Math.random() * (max - min - 1)) + min + 1;
		
		int aleRangoIncluido = (int)(Math.random() * (max - min + 1)) + min;
		
		System.out.println("aleatorio dentro de un rango siendo el mayor excluido : "+ aleRangoExcluido);
		
		System.out.println("aleatorio dentro de un rango siendo el mayor excluido segunda forma: "+ aleRangoExcluidoLosDos);
		
		System.out.println("aleatorio dentro de un rango incluido los dos  : "+ aleRangoIncluido);
		
		
		
		
		
		

	}

}
