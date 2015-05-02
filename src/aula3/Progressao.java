package aula3;

import java.util.Scanner;

public class Progressao {
	public static void main(String ... args)
	{
		int contador = 1;
		int acumulador = 0;
		int x = 0;
		Scanner ler = new Scanner( System.in );
		
		System.out.println("Digite valor de x ");
		x = ler.nextInt();
		
		do
		{
			acumulador = acumulador + contador * x;  
			contador = contador + 1;
		} while ( contador <= 20 );
		
		System.out.println(acumulador);
		ler.close();
	}
}
