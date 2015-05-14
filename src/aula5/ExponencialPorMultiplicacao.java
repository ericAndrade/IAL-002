package aula5;

import java.util.Scanner;

public class ExponencialPorMultiplicacao
{
	public static int exp(int n1, int exp)
	{
		int contador = 0;
		int acumulador = 1;
		do
		{
			acumulador = acumulador * n1;
			contador++;
		} while ( contador < exp);
		return acumulador;
	}
	
	public static void main(String ... args)
	{
		Scanner in = new Scanner(System.in);
		int x = 0;
		int y = 0;
		int resultado = 0;
		System.out.println("Entre com o x número de x^y");
		x = in.nextInt();
		System.out.println("Entre com o y número de x^y");
		y = in.nextInt();
		resultado = exp( x , y );
		System.out.println("Resultado "+ resultado);
		in.close();
	}
}
