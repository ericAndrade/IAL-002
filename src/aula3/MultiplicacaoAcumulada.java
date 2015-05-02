package aula3;

public class MultiplicacaoAcumulada {
	public static void main(String[] args)
	{
		int contador = 1;
		int acumulador = 1;
		do 
		{
			acumulador = acumulador * contador;
			contador = contador + 1;
		} while (contador <= 5);
		
		System.out.println( acumulador );
	}
}
