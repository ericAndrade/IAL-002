package aula5;

import java.util.Scanner;

public class Juros
{
	public static double valorFuturo(int capital, int nPrazo, int iTaxa)
	{
		double valorFuturo = 0.0;
			   valorFuturo = capital*(1+iTaxa)^nPrazo;
		return valorFuturo;
	}
	
	public static double capitalNecessario( int nPrazo, int iTaxa, int vFuturo)
	{
		double capitalNecessario = 0.0;
			   capitalNecessario = vFuturo/Math.pow(( 1+ (iTaxa/100.0)), nPrazo);
		return capitalNecessario;
	}
	
	public static void main(String ... oiEuGostoDeProgramar)
	{
		Scanner in = new Scanner(System.in);
		int capital = 0;
		int taxa = 0;
		int prazo = 0;
		int vFuturo = 0;
		double valorF = 0.0;
		double capitalN = 0.0;
		
		System.out.println("Entre com o valor de capital");
		capital = in.nextInt();
		System.out.println("Entre com o valor da taxa");
		taxa = in.nextInt();
		System.out.println("Entre com o valor do Prazo");
		prazo = in.nextInt();
		valorF = valorFuturo(capital, prazo, taxa );
		System.out.println("Valor Futuro = "+ valorF+"\n\n");
		
		System.out.println("Entre com o valor do Prazo");
		prazo = in.nextInt();
		System.out.println("Entre com o valor da taxa");
		taxa = in.nextInt();
		System.out.println("Entre com o valor da Valor Futuro");
		vFuturo = in.nextInt();
		capitalN = capitalNecessario( prazo, taxa, vFuturo);
		System.out.println("Capital necessário "+ capitalN);
		in.close();
	}
}
