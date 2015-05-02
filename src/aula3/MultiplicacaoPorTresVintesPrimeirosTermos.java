package aula3;

public class MultiplicacaoPorTresVintesPrimeirosTermos {
	public static void main(String ... args)
	{
		int contador = 1;
		int n1 = 1;
		do
		{
			n1 = n1 * 3;
			contador = contador + 1;
			System.out.println( n1 );			
		} while ( contador <= 20 );
	}
}
