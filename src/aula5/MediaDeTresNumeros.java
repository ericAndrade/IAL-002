package aula5;

import java.util.Scanner;

public class MediaDeTresNumeros
{
	public static double mediaDeTres(int n1, int n2, int n3)
	{
		int total = n1+n2+n3;
		double resultado = total / 3.0;
		return resultado;
	}
	
	public static void main(String ... args)
	{
		Scanner in = new Scanner(System.in);
		int n1 = 0;
		int n2 = 0;
		int n3 = 0;
		double resultado = 0.0;
		System.out.println("Entre com o primeiro numero");
		n1 = in.nextInt();
		System.out.println("Entre com o segundo numero");
		n2 = in.nextInt();
		System.out.println("Entre com o terceiro numero");
		n3 = in.nextInt();
		
		resultado = mediaDeTres(n1, n2, n3);
		System.out.println("O média dos números é "+ resultado );
		in.close();
	}
}
