package aula3;

public class SomaDeNumeroParesMenoresQue100 {
	public static void main(String[] args)
	{
		int contador = 1;
		int quantidadeSomaDePares = 0;
		
		do
		{
			if( contador % 2 == 0 )
			{
				quantidadeSomaDePares = quantidadeSomaDePares + contador;
			}
			contador = contador + 1;
		}while( contador < 100 );
		
		System.out.println( quantidadeSomaDePares );

	}
}
