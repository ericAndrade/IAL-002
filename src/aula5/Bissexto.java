package aula5;

import java.util.Scanner;

public class Bissexto
{
	public static boolean validarBissexto(int ano)
	{
		boolean isBissexto = (( ( (ano%100!=0) && (ano%4==0) ) ||(ano%400==0) )? true: false);
		return  isBissexto;
	}
	
	public static void main(String ... anoBissexto)
	{
		Scanner in = new Scanner(System.in);
		int ano = 0;
		System.out.println("Entre com o ano");
		ano = in.nextInt();
		if(validarBissexto(ano))
		{
			System.out.println("["+ano+ "] é bissexto");
		}
		else
		{
			System.out.println("["+ano+ "] não é bissexto");
		}
		in.close();
	}
	
}
