package aula3;

import java.util.Scanner;

public class NumeroAoExpoente {
	public static void main(String[] args)
	{
		int n1 = 0;
		int n2 = 0;
		int resultado = 0;
		int contador = 0;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite n1");
		n1 = ler.nextInt();
		System.out.println("Digite n2");
		n2 = ler.nextInt() -1;
		
		resultado = n1;
		
		do {
			resultado = resultado * n1;
			contador = contador + 1;
		} while ( contador < n2 );
		
		System.out.println( resultado );
		
		ler.close();
	}
}
