package aula3;

import java.util.Scanner;

public class CalcularValorDeY {
	public static void main(String ... args)
	{
		int contador = 1;
		int x = 0;
		int y = 0;
		Scanner ler = new Scanner( System.in );
		
		System.out.println("Digite o valor de x");
		x=ler.nextInt();
		
		do 
		{
			y = y + ( x * contador );
			contador = contador + 1;
		} while ( contador <= 100 );
		
		System.out.println("Valor de y = "+ y);
		ler.close();
		
	}
}
