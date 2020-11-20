package practice;

public class Reverse {
	
	
	public static int Reversno(int num)
	{
		int t,r=0,rev=0;
		t=num;
		while(num>0) {
		r=num%10;
		rev=(rev*10)+r;
		num=num/10;
		}
		return rev;
	}

	public static void main(String[] args) {
		
		System.out.println("Reverse Number=" +(Reversno(123)));

	}

}
