package aula3;

import java.util.Scanner;

public class MostrarSerieAteN {
	public static void main(String[] args)
	{
		int contador = 1;
		int limite = 0;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite um valor de N");
		limite = ler.nextInt();
		
		do 
		{
			System.out.println( contador );
			contador = contador + 1;
		} while ( contador <= limite );
		
		ler.close();
	}
}
