package aula1;
import java.util.Scanner;


public class CalcCircle {
	public static void main(String[] args)
	{
		int raio = 0;
		double area = 0;
		double comprimento = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite o raio do circulo:>");
		raio = scan.nextInt();
		area = 3.14159 * (raio*raio);
		comprimento = 2 * 3.14159 * raio;
		
		System.out.println("Area : " + area);
		System.out.println("Comprimento: "+ comprimento);
		scan.close();
	}
}
