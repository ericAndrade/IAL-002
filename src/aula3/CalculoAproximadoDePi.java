package aula3;

public class CalculoAproximadoDePi {
	public static void main(String ... args)
	{
		int contador = 1;
		int n1 = 1;
		double s = 0;
		double resultado = 0;
		
		do 
		{
			s = (s + ( 1.0/Math.pow( n1 , 3) )); 
			n1 = n1 + 2;
			contador = contador + 1;
			
		} while ( contador <= 30);
		resultado = Math.pow( (s*32.0) , (1/3.0) );
		System.out.println( resultado );
	}
}
