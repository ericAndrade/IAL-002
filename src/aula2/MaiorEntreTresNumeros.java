package aula2;

import java.util.Scanner;

public class MaiorEntreTresNumeros {
	public static void main(String ... tresPontos)
	{
		Scanner ler = new Scanner(System.in);
		int primeiroNumero = 0;
		int segundoNumero = 0;
		int terceiroNumero = 0;
		
		System.out.println("Digite o Primeiro número");
		primeiroNumero = ler.nextInt();
		System.out.println("Digite o Segundo número");
		segundoNumero= ler.nextInt();
		System.out.println("Digite o Terceiro número");
		terceiroNumero = ler.nextInt();
		
		if(primeiroNumero > segundoNumero && primeiroNumero > terceiroNumero)
		{
			System.out.println(primeiroNumero + " é maior que "+ segundoNumero+ " e "+ terceiroNumero);
		}else{
			if(segundoNumero > primeiroNumero)
			{
				System.out.println(segundoNumero + " é maior que "+ primeiroNumero+ " e "+ terceiroNumero);
			}else{
				System.out.println(terceiroNumero + " é maior que "+ primeiroNumero+ " e "+ segundoNumero);
			}
		}
		ler.close();
		
	}
}
