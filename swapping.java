import java.util.Scanner;
public class swapping {

	
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		    System.out.println("Enter 1st number");
       
	        int a=sc.nextInt();
	        System.out.println("Enter 2nd number");
	        int b=sc.nextInt();
	        System.out.println("First number "+a);
	        System.out.println("Second number "+b);
	        int tmp=a;
	        a=b;
	        b=tmp;
	        System.out.println(" After Swap");
	        System.out.println("First number "+a);
	        System.out.println("Second number "+b);
	        
	}

}
