package aula5;

import java.util.Scanner;

public class MaiorEMenor
{
	public static int pegarMenor(int n1, int n2)
	{
		return ( n1 < n2? n1 : n2);
	}
	
	public static int pegarMaior(int n1, int n2)
	{
		return ( n1 > n2? n1 : n2);
	}
	
	public static void main(String ... wow)
	{
		Scanner in = new Scanner(System.in);
		int n1 = 0;
		int n2 = 0;
		int maior = 0;
		int menor = 0;
		System.out.println("Entre com primeiro numero");
		n1 = in.nextInt();
		System.out.println("Entre com primeiro numero");
		n2 = in.nextInt();
		maior = pegarMaior(n1, n2);
		menor = pegarMenor(n1, n2);
		
		System.out.println("Maior Numero = "+ maior);
		System.out.println("Menor Numero = "+ menor);
		
		in.close();
	}
}
