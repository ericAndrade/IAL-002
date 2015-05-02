package aula1;
import java.io.PrintStream;


public class Precedencia {
	public static void main(String ... args)
	{
		PrintStream out = System.out;
		out.println("2*6 + 11*5 = "+ ( (2*6) + (11*5) ) );
		out.println("20/(-2)/5 = " + 20/(-2)/5);		
		out.println("20/2*2 = "+ 20/(2*2));
		out.println("(3+9)/3*4 = "+ (3+9)/(3*4));
		out.println("(5*6/(3+2) - 15*4)/6-4 = "+ ((5*6/(3+2) - 15*4)/6-4)); 
		out.println("4+(32*2) -7*2/(9-2) = "+ (4+32*2 -7*2/(9-2))); 
	}
}
