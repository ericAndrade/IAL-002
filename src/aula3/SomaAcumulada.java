package aula3;

public class SomaAcumulada {
	public static void main(String[] args)
	{
		int contador = 1;
		int acumulador = 0;
		do 
		{
			acumulador = acumulador + contador;
			contador = contador + 1;
		} while (contador <= 50);
		
		System.out.println( acumulador );
	}
}
