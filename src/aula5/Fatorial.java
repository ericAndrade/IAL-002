package aula5;

public class Fatorial
{
	public static int fatorial(int n)
	{
		if( n == 0)
		{
			return 1;
		}else{
			return fatorial(n) + fatorial(n-1);
		}
	}
	
	public static void contador(int x)
	{
		System.out.println(x);
		if(x != 0)
		{
			contador(x-1);
		}
	}
	public static void main(String ... abc)
	{
//		System.out.println(fatorial(4));
		contador(100);
	}
}
