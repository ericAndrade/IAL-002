package aula5;

import java.util.Scanner;

public class SegundoGrau
{
	public static void segundoGrau(int a, int b, int c)
	{
		
	}
	
	public static void main(String ... algoritmoLegal)
	{
		Scanner in = new Scanner(System.in);
		int a = 0;
		int b = 0;
		int c = 0;
		double x1 = 0;
		double x2 = 0;
		double delta = 0;
		
		System.out.println("Entre com o valor de a = em (ax2+bx+c=0)");
		a = in.nextInt();
		System.out.println("Entre com o valor de b = em (ax2+bx+c=0)");
		b = in.nextInt();
		System.out.println("Entre com o valor de c = em (ax2+bx+c=0)");
		c = in.nextInt();
		
		delta = Math.pow( b , 2 ) - 4.0 * a * c;
		System.out.println(delta);
		if( delta >= 0 )
		{
			x1 = ((-b) + (Math.sqrt(delta)))/(2*a);
			x2 = ((-b) - (Math.sqrt(delta)))/(2*a);
			
			System.out.println("Raiz x1 = "+ x1);
			System.out.println("Raiz x2 = "+ x2);
		}
		else
		{
			System.out.println("Não existe raiz real");
		}
		
		in.close();
	}
}
