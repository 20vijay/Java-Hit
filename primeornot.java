import java.util.Scanner;


public class primeornot {


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int temp;
		boolean isPrime=true;
	    int num=sc.nextInt();
	    for(int i=2;i<=num/2;i++)
	    {
	    	temp=num%i;
	    	if(temp==0)
	    	{
	    		isPrime=false;
	        break;		
	    	}
	    }
	    if(isPrime)
	    {
	    	System.out.println(num+" is a prime number");
	    }
	    else
	    {
	    	System.out.println(num+"is not a prime number");
	    }
	}

}
