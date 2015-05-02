package aula3;

public class MostrarSerieInteirosImpares {
	public static void main(String[] args)
	{
		int contador = 1;
		
		do 
		{
			System.out.println( contador );
			contador = contador + 2;
		} while ( contador <= 99 );
	}
}
