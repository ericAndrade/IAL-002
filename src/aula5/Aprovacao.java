package aula5;

import java.util.Scanner;

public class Aprovacao
{
	public static boolean aprovado(int nota)
	{
		return nota >= 6;
	}
	
	public static void main(String [] abc)
	{
		Scanner in = new Scanner(System.in);
		int nota = 0;
		
		System.out.println("Entre com a nota");
		nota = in.nextInt();
		if(aprovado(nota))
		{
			System.out.println("Aprovado");
		}else{
			System.out.println("Reprovado");
		}
		in.close();
	}
}
