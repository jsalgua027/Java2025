
public class EJ08OperacionesAlgebraicas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 *
		 *  Crea una nueva clase llamada Ej08, que contenga una llamada al método public static
			void main(String[] args). La aplicación Java contendrá comentarios descriptivos del código
			y realice lo siguiente:
			a.- Declara e inicializa tres variables int (a=10, b=5, i=0)
			b.- Declara e inicializa dos variables double (c=71.3 y d=4.8)
			c.- Realiza las siguiente operaciones aritméticas a+b, a-b, a*b, a/b, c+d, c-d, c*d,
			c/d. El resultado de cada operación se almacena en una nuevas variables que se crearán
			para tal efecto.
			d.- Muestra el resultado de cada operación, usando las variables creadas en el
			paso c).
			e.- También muestra en pantalla los resultados de las siguientes operaciones: a*=3,
			b-=1, a/=b, c+=d.
			f.- Finalmente, el programa muestra en consola la siguiente información, en
			distintas instrucciones: valor de i, valor de i++, valor de i y valor de ++i.
         */
		
		
		//A
		 int a=10,b=5,i=0;
		//B
		 double c=71.3, d=4.8;
		//C
		 int res=a+b;
		 int res1=a-b;
		 int res2=a*b;
		 int res3=a/b;
		 double res4=c+d;
		 double res5=c-d;
		 double res6=c*d;
		//D
		 System.out.println("El resultado de la suma--->"+res);
		 System.out.println("El resultado de la resta--->"+res1);
		 System.out.println("El resultado de la multipliación--->"+res2);
		 System.out.println("El resultado de la división--->"+res3);
		 System.out.println("El resultado de la operacion con decimales --->"+res4);
		 System.out.println("El resultado de la operacion con decimales --->"+res5);
		 System.out.println("El resultado de la operacion con decimales --->"+res6);
		 
		 //E
		 a*=3;
		 System.out.println("a=10  ahora a vale-->"+a);
		 b-=1;
		 System.out.println("b=5 ahora b vale-->"+b);
		 a/=b;
		 System.out.println("a=10 ahora a vale-->"+a);
		 c+=d;
		 System.out.println("c=71.3 ahora c vale-->"+c);
		
		 //F
		 
		 System.out.println("el valor de i es -->"+i);
		 System.out.println("el valor de i++ es -->"+i++);
		 System.out.println("el valor de i es -->"+i);
		 System.out.println("el valor de ++i es -->"+ ++i);
		
		
	
		

	}

}
