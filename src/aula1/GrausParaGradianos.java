package aula1;
import java.util.Scanner;


public class GrausParaGradianos {
	public static void main(String[] args)
	{
		int graus = 0;
		double rad = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("\nDigite em graus:>");
		graus = scan.nextInt();
		rad = graus * ( 3.14159/180 );
		System.out.println(graus +"º são equivalentes a "+ rad +"rad");
		scan.close();
	}
}
