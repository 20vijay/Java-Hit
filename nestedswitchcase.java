import java.util.Scanner;


public class nestedswitchcase {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1 or 2");
	    int a=sc.nextInt();
	    int b=sc.nextInt();
	    switch(a)
	    {
	    	case 1:
	    	{
	    		System.out.println("hi friends");
	    	}
	    	case 2:
	    	{
	    		switch(b)
	    		{
	    			case 1:
	    			{
	    				System.out.println("Hello");
	    			}
	    			case 2:
	    			{
	    				System.out.println("i am vijay");
	    			}
	    		}
	    	}
	    }
	    
	}

}
