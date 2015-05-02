package aula2;

import java.util.Scanner;

public class EquacaoDeSegundoGrau {
	public static void main(String ... args)
	{
		
		Scanner ler = new Scanner(System.in);
		int a = 0;
		int b = 0;
		int c = 0;
		int delta = 0;
		double x1 = 0;
		double x2 = 0;
		
		System.out.println("Algoritmo para solução de raízes em ax²+bx+c=0");
		System.out.println("Digite o valor de 'a' ");
		a = ler.nextInt();
		System.out.println("Digite o valor de 'b' ");
		b = ler.nextInt();
		System.out.println("Digite o valor de 'b' ");
		c = ler.nextInt();
		delta = (b*b) -4 * a * c;
		
		if(delta >= 0)
		{
			x1 = (-b + Math.sqrt(delta)) / (2*a);
			x2 = (-b - Math.sqrt(delta)) / (2*a);
			System.out.println("x1="+x1);
			System.out.println("x2="+x2);
		}else{
			System.out.println("Não tem solução real,delta vale ="+ delta);
		}
		
		ler.close();
	}
}
