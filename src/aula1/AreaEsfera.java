package aula1;
import java.util.Scanner;


public class AreaEsfera {
	public static void main(String ... x)
	{
		int raio = 0;
		double volume = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite o raio da esfera:>");
		raio = scan.nextInt();
		volume = 4.0/3.0 * 3.14159 * (raio*raio*raio);
		System.out.println("Volume = "+ volume);
		scan.close();
	}
}
