package aula2;

import java.util.Scanner;

public class TrianguloEmPlanoCartesiano {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double a = 0;
		double b = 0;
		double c = 0;
		double area = 0;
		double sp = 0;
		double perimetro = 0;
		
		int x1 = 0;
		int y1 = 0;
		
		int x2 = 0;
		int y2 = 0;
		
		int x3 = 0;
		int y3 = 0;
		
		System.out.println("DIGITE A CORDENADA X1");
		x1 = ler.nextInt();
		System.out.println("DIGITE A CORDENADA Y1");
		y1 = ler.nextInt();
		
		System.out.println("DIGITE A CORDENADA X2");
		x2 = ler.nextInt();
		System.out.println("DIGITE A CORDENADA Y2");
		y2 = ler.nextInt();
		
		System.out.println("DIGITE A CORDENADA X3");
		x3 = ler.nextInt();
		System.out.println("DIGITE A CORDENADA Y3");
		y3 = ler.nextInt();
		
		a = Math.sqrt( Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2) );
		b = Math.sqrt( Math.pow((x3-x2), 2) + Math.pow((y3-y2), 2) );
		c = Math.sqrt( Math.pow((x1-x3), 2) + Math.pow((y1-y3), 2) );
		
		sp = (a+b+c)/2.0;
		area = 	Math.sqrt( sp*(sp-a)*(sp-b)*(sp-c) );
		perimetro = a+b+c;
		
		System.out.println("Tamanho: A="+a+" B="+b +" C="+c);
		System.out.println("Area = " + area);
		System.out.println("Perimetro = "+ perimetro);
		ler.close();
	}

}
