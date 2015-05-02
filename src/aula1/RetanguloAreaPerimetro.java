package aula1;
import java.io.PrintStream;
import java.util.Scanner;


public class RetanguloAreaPerimetro {
	public static void main(String ... args)
	{
		Scanner scan = new Scanner(System.in);
		PrintStream out = System.out; 
		int altura = 0;
		int largura = 0;
		int perimetro = 0;
		int area = 0;
		
		out.print("\nDigite a Altura do retângulo:>");
		altura = scan.nextInt();
		
		out.print("\nDigite a Largura do retângulo:>");
		largura = scan.nextInt();
		out.println("------------------------------");
		
		perimetro = largura*2 + altura * 2;
		area = largura * altura;
		
		out.println("Perímetro: "+ perimetro);
		out.println("Área: "+ area);
		scan.close();
		
	}
}
