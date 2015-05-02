package aula2;

import java.util.Scanner;

public class AnoBissexto {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int ano = 0;
		System.out.println("Digite o ano, Ex: 2015");
		ano = ler.nextInt();
		
		if( ( ano % 4 == 0 && ano % 100 != 0 ) || ano % 400 == 0 )
		{
			System.out.println("Ano bissexto");
		}else{
			System.out.println("Ano não é bissexto");
		}
		ler.close();
	}

}
