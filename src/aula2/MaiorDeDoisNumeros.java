package aula2;

import java.util.Scanner;

public class MaiorDeDoisNumeros {
	public static void main(String ... argumentos)
	{
		Scanner ler = new Scanner(System.in);
		int primeiroNumero = 0;
		int segundoNumero = 0;
		
		System.out.println("Entre com o primeiro número");
		primeiroNumero = ler.nextInt();
		System.out.println("Entre com o segundo número");
		segundoNumero = ler.nextInt();
		
		if(primeiroNumero > segundoNumero)
		{
			System.out.println(primeiroNumero +" é maior "+ segundoNumero);
		}else{
			System.out.println(segundoNumero +" é maior "+ primeiroNumero);
		}
		
		ler.close();
	}
}
