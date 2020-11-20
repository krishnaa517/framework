package practice;

public class Primenumber {
static int count=0;
public static boolean isPrimenumber(int num)
	{
		if(num<=1)
		return false;
		for(int i=2;i<num;i++)
		{
			if(num % i == 0)
			return false;
		}
			return true;
	}
public static void Getprimenumbers(int num) {
		for(int i=2;i<=num;i++)
		{
			if(isPrimenumber(i))
			{
				System.out.print(i +" ");
				count++;
			}
		}
		System.out.println();
		System.out.println("number of prime numbers = " + count);
	}
		
	public static void main(String[] args)
	{
		
		Getprimenumbers(20);
	}
	

}
