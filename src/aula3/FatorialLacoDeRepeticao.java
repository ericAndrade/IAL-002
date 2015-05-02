package aula3;

import java.util.Scanner;

public class FatorialLacoDeRepeticao {
	public static void main(String ... args)
	{
		int n = 0;
		int contador = 1;
		int fatorial = 0;
		Scanner ler = new Scanner( System.in );
		
		System.out.println("Digite o valor de n");
		n = ler.nextInt();
		
		do 
		{
			fatorial = fatorial + contador;
			contador = contador + 1;
		} while ( contador <= n );
		
		System.out.println( n + "! = " + fatorial );
		ler.close();
	}
}
