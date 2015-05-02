package aula3;

import java.util.Scanner;

public class MostrarNTermosESoma {
	public static void main(String ... args)
	{
		int contador = 1;
		int acumulador = 3;
		int n = 0;
		int total = 0;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o valor de n");
		n = ler.nextInt();
		
		do
		{
			total = total + acumulador;
			System.out.println(acumulador);
			acumulador = acumulador * 3;
			
			contador = contador + 1;
		} while ( contador <= n );
		
		System.out.println(total);
		ler.close();
	}
}
