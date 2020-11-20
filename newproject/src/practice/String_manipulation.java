package practice;

public class String_manipulation {

	public static void main(String[] args) {
		
		String str="take all reponcibilities in ur sholders shoor ";
		System.out.println(str.length());
		System.out.println(str.indexOf('s'));
		System.out.println(str.indexOf('s',str.indexOf('s')+1));
		System.out.println(str.indexOf('s',str.indexOf('s',str.indexOf('s')+1)));
		System.out.println(str.indexOf('s',str.indexOf('s',str.indexOf('s',str.indexOf('s')+1))));
		
		
		System.out.println(str.replace(" ", "/"));
		
		String a[]=str.split(" ");
		int len=a.length;
		for(int i=len-1;i>=0;i--)
			System.out.println(a[i]);
	}

}
