import java.util.Scanner;


public class triangle {


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
        int height=sc.nextInt();
        int breadth=sc.nextInt();
        int area=(height*breadth)/2;
        System.out.println("Area of a Trinagle "+area);
	}

}
