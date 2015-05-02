package aula3;

import java.util.Scanner;

public class QuantiadeDeNumerosPares {
	public static void main(String[] args)
	{
		int n1  = 0;
		int n2  = 0;
		int leitura1 = 0;
		int leitura2 = 0;
		int quantidadeDePares = 0;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número");
		leitura1 = ler.nextInt();
		System.out.println("Digite o segundo número");		
		leitura2 = ler.nextInt();
		
		if( leitura1 < leitura2 )
		{
			n1 = leitura1;
			n2 = leitura2;
		}
		else
		{
			n1 = leitura2;
			n2 = leitura1;
		}
		
		do
		{
			if( n1 % 2 == 0 )
			{
				quantidadeDePares++;
			}
			n1++;
		}while( n1 <= n2 );
		
		System.out.println( quantidadeDePares );
		ler.close();
	}
}
