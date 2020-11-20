package practice;

public class StringSwap {

	public static void main(String[] args) {
		
		String a="Hello";
		String b= "World";
		System.out.println("Before swaping");
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("********************");
		//append
		a=a+b; //"HelloWorld"
		
		b=a.substring(0, a.length()-b.length());  //Hello
		a=a.substring(b.length());
		
		System.out.println("After swaping");
		System.out.println("a="+a);
		System.out.println("b="+b);
		
		
	
	
	

	}

}
