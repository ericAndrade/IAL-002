package aula2;

import java.util.Scanner;

public class TrianguloCalculos {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int a=0;
		int b=0;
		int c=0;
		double s=0;
		double area=0;
		
		System.out.println("Digite A");
		a = ler.nextInt();
		System.out.println("Digite B");
		b = ler.nextInt();
		System.out.println("Digite C");
		c = ler.nextInt();
		
		
		s = (a+b+c)/2.0;
		area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		
		if((a<(b+c))&&(c<(a+b))&&(b<(a+c)))
		{
			if(a == b && b == c)
			{
				System.out.println("Triângulo equilátero");
			}else{
				if(a == b || b == c || c == a)
				{
					System.out.println("Triângulo isóceles");
				}else{
					System.out.println("Triângulo escaleno");
				}
			}
			
			System.out.println("Perímetro = "+ (a+b+c));
			System.out.println("Área = "+ area);
			
			
		}
		ler.close();
	}

}
