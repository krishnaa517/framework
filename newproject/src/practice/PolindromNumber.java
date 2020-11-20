package practice;


public class PolindromNumber { 
	
	public static boolean ispolindromnumber(int num)
	{
		//151 353
		int r=0,sum=0,t;
		t=num;
		while(num>0) {
			r=num%10;
		
			sum=(sum*10)+r;
			num=num/10;
		}
		if(sum==t)
			return true;
		else
			return false;
	}
	
public static void getPolindromnumbers(int num)
{
	for(int i=10;i<=num;i++) {
		if(ispolindromnumber(i))
			System.out.print(i + "  ");
			
	}
	}
	public static void main(String[] args) {
		getPolindromnumbers(200);

	}

}
