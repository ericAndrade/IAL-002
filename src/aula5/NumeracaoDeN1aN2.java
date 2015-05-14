package aula5;

import java.util.Scanner;

public class NumeracaoDeN1aN2
{
	public static void contar(int n1, int n2)
	{
		do
		{
			System.out.println(n1);
			n1++;
		} while ( n1 <= n2 );
	}
	
	public static void main(String ... strin)
	{
		Scanner in = new Scanner(System.in);
		int n1 = 0;
		int n2 = 0;
		
		System.out.println("Entre com o valor de n1");
		n1 = in.nextInt();
		System.out.println("Entre com o valor de n2");
		n2 = in.nextInt();
		
		if(n1 > n2)
		{
			contar(n2, n1);
		}else{
			contar(n1, n2);
		}
		in.close();
	}
}
