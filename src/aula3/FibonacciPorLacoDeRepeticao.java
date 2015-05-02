package aula3;

import java.util.Scanner;

public class FibonacciPorLacoDeRepeticao {
	public static void main(String ... args)
	{
		int n1 = 0;
		int n2 = 1;
		int tmp = 0;
		int n = 0;
		int contador = 1;
		Scanner ler = new Scanner( System.in );
		System.out.println("Digite o valor de N ");
		n = ler.nextInt();
		do
		{
			System.out.println( n2);
			tmp = n2;
			n2 = n1 + n2; 
			n1 = tmp;
			contador = contador + 1;
		} while ( contador <= n);
		
		ler.close();
	}
}
