package aula2;

import java.util.Scanner;

public class LerDoisNumerosEfetuarDivisao {
	
	public static void main(String ... a)
	{
		Scanner ler = new Scanner(System.in);
		double n1 = 0;
		double n2 = 0;
		
		System.out.println("Digite o primeiro número");
		n1 = ler.nextDouble();
		System.out.println("Digite o segundo número");
		n2 = ler.nextDouble();
		
		if( n1 > 0  && n2 > 0)
		{
			System.out.println(n1 +" / "+ n2 +" = "+ n1/n2);
		}else{
			System.out.println("n1 e n2 devem ser maiores que 0 ");
		}
		
		ler.close();
	}
}
