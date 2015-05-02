package aula3;

import java.util.Scanner;

public class VerificarDadoJogo {
	public static void main(String ... ProgramaEhUmaCoisaLegal)
	{
		Scanner ler = new Scanner( System.in );
		int totalNum1 = 0;
		int totalNum2 = 0;
		int totalNum3 = 0;
		int totalNum4 = 0;
		int totalNum5 = 0;
		int totalNum6 = 0;
		int resultado = 0;
		int contador = 1;
		int n = 0;
		
		System.out.println("Quantas vezes devo testar o dado?");
		n = ler.nextInt();

		do
		{
			resultado = ((int)(Math.random()*6))+1;
			
			if( resultado == 1 )
			{
				totalNum1++;
			}
			
			if( resultado == 2 )
			{
				totalNum2++;
			}
			
			if( resultado == 3 )
			{
				totalNum3++;
			}
			
			if( resultado == 4 )
			{
				totalNum4++;
			}
			
			if( resultado == 5 )
			{
				totalNum5++;
			}
			
			if( resultado == 6 )
			{
				totalNum6++;
			}
			
			contador = contador + 1;
		} while ( contador <= n );
		
		System.out.println("Face [1] "+ totalNum1);
		System.out.println("Face [2] "+ totalNum2);
		System.out.println("Face [3] "+ totalNum3);
		System.out.println("Face [4] "+ totalNum4);
		System.out.println("Face [5] "+ totalNum5);
		System.out.println("Face [6] "+ totalNum6);
		ler.close();
	}
}
