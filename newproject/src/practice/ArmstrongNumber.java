package practice;

public class ArmstrongNumber {
	
	public static boolean isArmstrongnumber(int num)
	{
		
		//153
		//1*1*1=1
		//5*5*5=125
		//3*3*3=27
		//(1*1*1)+(5*5*5)+(3*3*3)=153
		int t,r=0,p=0;
		t=num;
		while(num>0) {
			r=num%10;
			p=p+(r*r*r);
			num=num/10;
		}
		if(t==p)
			return true;
		else
			return false;
		
	}
	
	public static void getArmstrongnum(int num)
	{
		for(int i=100;i<=num;i++) {
			if(isArmstrongnumber(i))
				System.out.print(i + " ");
		}
			
	}

	public static void main(String[] args) {
		//System.out.println( isArmstrongnumber(153));
		
		getArmstrongnum(500);
	}

}
