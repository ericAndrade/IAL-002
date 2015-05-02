package aula2;

import java.util.Scanner;

public class Empregado {
	public static void main(String ... args)
	{
		Scanner ler = new Scanner(System.in);
		int salario = 0;
		System.out.println("Digite o salario do empregado");
		salario = ler.nextInt();
		
		if(salario < 100)
		{
			System.out.println("Isento");
		}
		else if(salario >= 100 && salario < 500)
		{
			System.out.println("10%");
		}else{
			System.out.println("25%");
		}
		
		ler.close();
	}
}
