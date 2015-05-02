package aula1;
import java.io.PrintStream;


public class DivMod {

	public static void main(String[] args)
	{
		PrintStream out = System.out;
		out.println("37 mod 13 = " + 37 % 13);
		out.println("41 div 7 = "+ 41/7);
		out.println("11 div 3 mod 2 	= ");
		out.println("11 mod 3 div 2	= ");
		out.println("====== Testes ======");
		//--------------------		
		int c1_dividendo = 37;
		int c1_divisor = 13;
		int c1_resto = c1_dividendo % c1_divisor;
		int c1_resultado = c1_dividendo / c1_divisor;
		
		out.println("37/13 = "+ c1_resultado +", então (13 * 2 + 11) = "+  (c1_divisor * c1_resultado + c1_resto));
		//--------------------
		int c2_dividendo = 41;
		int c2_divisor = 7;
		int c2_resto = c2_dividendo % c2_divisor;
		int c2_resultado = c2_dividendo / c2_divisor;

		out.println("41 div 7 = "+ c2_resultado +" com resto "+ c2_resto + ", então 5*7+6 = "+ (c2_resultado* c2_divisor + c2_resto) );
		//--------------------
		int c3a_dividendo = 11;
		int c3a_divisor = 3;
		int c3a_resto = c3a_dividendo % c3a_divisor;
		int c3a_resultado = c3a_dividendo / c3a_divisor;
		
		int c3b_dividendo = c3a_resultado;
		int c3b_divisor = 2;
		int c3b_resto = c3b_dividendo / c3b_divisor;
		int c3b_resultado = c3b_dividendo / c3b_divisor;
		
		out.println("11 div 3 mod 2 = " + c3b_resultado +", então ((2 * 1 + 1) * 3+2)) = " + ((c3b_divisor * c3b_resultado + c3b_resto) * c3a_resultado+c3a_resto));
		//--------------------
		int c4a_dividendo = 11;
		int c4a_divisor = 3;
		int c4a_resto = c4a_dividendo % c4a_divisor;
		int c4a_resultado = c4a_dividendo / c4a_divisor;
		int c4b_dividendo = c4a_resto;
		int c4b_divisor = 2;
		int c4b_resto = c4a_resultado % c4b_divisor;
		int c4b_resultado = c4a_resultado / c4b_dividendo;
		out.println("11 mod 3 div 2	= "+ c4b_resultado + ", então ((2 * 1 + 1) * 3 + 2)) = "+((
		c4b_divisor * c4b_resultado + c4b_resto) * c4a_resultado + c4a_resto));
		//--------------------		
	}

}
