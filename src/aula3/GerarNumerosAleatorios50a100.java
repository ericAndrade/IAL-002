package aula3;

public class GerarNumerosAleatorios50a100 {
	public static void main(String ... x)
	{
		int contador = 1;
		
		do
		{
			System.out.println(( (int) ((Math.random()*101)/2) ) + 50  );
			contador = contador + 1;
		} while ( contador <= 50 );
	}

}
