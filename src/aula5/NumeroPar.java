package aula5;

import java.util.Scanner;

public class NumeroPar
{
	public static boolean numeroPar(int numero)
	{
		return ( numero %2 == 0 );
	}
	
	public static void main(String ... helloWorld)
	{
		Scanner in = new Scanner(System.in);
		int numero = 0;
		System.out.println("Entre com um número");
		numero = in.nextInt();
		
		if( numeroPar(numero) )
		{
			System.out.println("É Par");
		}
		else
		{
			System.out.println("É Inpar");
		}
		
		in.close();
	}
}
