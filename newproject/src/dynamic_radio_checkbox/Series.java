package dynamic_radio_checkbox;
public class Series {

		    public static void series(int n)  //n=3
		    {
		    	 double sum=0;
		         double s=1;
		         int mul=1;
		         for(int i=1,j=2;i<=n &&j<=n;i++,j++)
		         {
		             mul=mul*j;
		             s=i+i;
		             sum=sum+s/mul;
		        }
		        System.out.println(" " +sum);
		    
		    }
		    
		    public static void main(String[] args) {
		    	
		    	series(3);
		    	
		    }
		}


// 1+(1+2)+(1+2+3)+(1+2+3+4)