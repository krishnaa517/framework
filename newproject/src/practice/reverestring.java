package practice;

import java.util.HashSet;
import java.util.Set;

public class reverestring {
	
	public static void main(String[] args) {
		
			String str[]= {"java","javascript","Ruby","phythan",};
			for(int i=0;i<str.length;i++)
			{
				for(int j=i+1;j<str.length;j++) {
					if(str[i].equalsIgnoreCase(str[j]))
					System.out.println("Duplicate value =" +str[j]);		
			}
		}
			System.out.println("*************");
	
	//Using set interface java collections
	Set<String>store=new HashSet<String>();
	for(String name :str) {
		if(store.add(name)==false) {
			System.out.println("Duplicate value ="+ name);
			
		}
		
	}
	System.out.println(store);
	
	// Using map interface HashMap class
	Map<>
	
}
	
}	
	

