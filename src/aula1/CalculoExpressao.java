package aula1;
import java.util.Scanner;


public class CalculoExpressao {
	public static void main(String[] args) 
	{
		int entradaA = 0;
		int entradaB = 0;
		int entradaF = 0;
		double resultado = 0.0;
		Scanner scan = new Scanner(System.in);
		System.out.print("\nDigite entrada A:>");
		entradaA = scan.nextInt();
		System.out.print("\nDigite entrada B:>");
		entradaB = scan.nextInt();
		System.out.print("\nDigite entrada F:>");
		entradaF = scan.nextInt();
		
		resultado = (Math.sqrt( 2 * entradaB - 4 * entradaA) + Math.pow(2 * entradaF, -3))/(3-2*entradaA);
		System.out.println("X = " + resultado);
		scan.close();
	}
}
