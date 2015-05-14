package aula5;

import java.util.Scanner;

public class MaiorDe3
{
	public static int maiorDeTres(int n1, int n2, int n3)
	{
		if(n1 > n2 && n2 > n3)
		{
			return n1;
		}
		else if(n2 > n1 && n2 > n3)
		{
			return n2;
		}
		else
		{
			return n3;
		}
	}
	
	public static void main(String ... args)
	{
		Scanner in = new Scanner(System.in);
		int n1 = 0;
		int n2 = 0;
		int n3 = 0;
		int maior = 0;
		System.out.println("Entre com o primeiro numero");
		n1 = in.nextInt();
		System.out.println("Entre com o segundo numero");
		n2 = in.nextInt();
		System.out.println("Entre com o terceiro numero");
		n3 = in.nextInt();
		
		maior = maiorDeTres(n1, n2, n3);
		System.out.println("O Maior número é "+ maior);
		in.close();
	}
}
