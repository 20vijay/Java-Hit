import java.util.Scanner;


public class vowel {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 System.out.println("Enter an alphabet");
	        char ch=sc.next().charAt(0);
	        System.out.println(ch);
	        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
	        {
	        	System.out.println("This is a vowel");
	        	
	        }
	        else
	        {
	        	System.out.println("This is not a vowel");
	        }
	        

	}

}
