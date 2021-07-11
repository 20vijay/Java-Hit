import java.util.Scanner;


public class arrayinput {


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] a=new int[10];
		int sum=0;
		System.out.println("Enter numbers");
		for(int i=1;i<10;i++)
		{
			a[i]=sc.nextInt();
			sum=a[i]+sum;
		}
		System.out.println("Total"+sum);
		
		
		
	    
	}

}
