//P74.java
import java.util.*;
//Podeu veure un exemple d’ús del mètode sqrt() de Java a: 
// https://docs.oracle.com/javase/7/docs/api/java/lang/Math.html
public class P74{
	public static void main (String [] args){
		Scanner entrada;
		double a, b;
		entrada = new Scanner (System.in);
		System.out.println("x?");
		int z = entrada.nextInt();
		b = Math.sqrt(z + 4);
		System.out.println(b);
	}
}
