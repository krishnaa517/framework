package practice;

import java.util.Arrays;

public class Largest_smallest_arrayvalue {
	public static void main(String[] args)
	{
		int arr[]= {10,9,20,6,30,50};
		int largest=arr[0];
		int smallest=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>largest)
				largest=arr[i];
			else if(arr[i]<smallest)
				smallest=arr[i];
				
		}
				System.out.println("Given array ="+ Arrays.toString(arr));
				System.out.println("largest ="+largest);
				System.out.println("smallest =" +smallest);
	}

}
