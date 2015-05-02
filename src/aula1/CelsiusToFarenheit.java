package aula1;
import java.util.Scanner;


public class CelsiusToFarenheit {

	public static void main(String[] args) 
	{
		int celcius = 0;
		double farenheit = 0.0;
		Scanner scan = new Scanner(System.in);
		System.out.print("\nDigite em graus:>");
		celcius = scan.nextInt();
		farenheit = celcius * (9/5.0) + 32;
		System.out.println(celcius +"ºC são equivalentes a "+ farenheit +"ºF");
		scan.close();
	}

}
