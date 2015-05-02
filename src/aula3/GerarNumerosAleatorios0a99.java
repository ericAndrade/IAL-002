package aula3;

public class GerarNumerosAleatorios0a99 {
	public static void main(String ... x)
	{
		int contador = 1;
		
		do
		{
			System.out.println( ((int) Math.random()*100));
			contador = contador + 1;
		} while ( contador <= 50 );
	}
}
