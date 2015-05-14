package aula5;

import java.util.Scanner;

public class Primos {
	public static boolean ePrimo(int n)
	{
		for(int i=2;i<n;i++)
		{
	        if(n%i==0)
	            return false;
	    }
	    return true;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Digite um numero para checar se ele é primo");
		int n = in.nextInt();
		if(ePrimo(n))
		{
			System.out.println("Primo");
		}else{
			System.out.println("Não primo");
		}
		in.close();
	}
}
