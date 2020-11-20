package practice;

public class Prim {
	
	public static boolean isprime(int num)
	{
		if(num<=0) {
			return false;
		}
		for(int i=2;i<num;i++) { 
			if(num%i==0)
				return false;
			
		}
		return true;
	
 }
	public static void Getprimenumers(int num)
	{
		for(int i=2;i<=num;i++) 
			if(isprime(i))
		
				System.out.print( i + " ");
		
	}
	
	public static void main(String[] args) {
		System.out.println(isprime(6));
		System.out.println(isprime(3));
		Getprimenumers(20);
	}
}


