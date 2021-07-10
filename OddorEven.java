import java.util.Scanner;


public class OddorEven {

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 System.out.println("Enter a number");
	        int a=sc.nextInt();
	        if(a%2==1)
	        {
	        	System.out.println("This is an odd number");
	        }
	        else
	        {
	        	System.out.println("This is an Even Number");
	        }
	}

}
