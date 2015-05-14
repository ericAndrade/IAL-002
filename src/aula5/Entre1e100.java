package aula5;

import java.util.Scanner;

public class Entre1e100 {
	public static boolean entre(int n1)
	{
		return n1 <= 100 && n1 >= 1;
	}
	public static void main(String ...strings)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Entre com um numero");
		int n1 = in.nextInt();
		if(entre(n1))
		{
			System.out.println("Está entre 1 e 100");
		}else{
			System.out.println("Não está entre 1 e 100");
		}
		in.close();
	}
}
