import java.util.Scanner;


public class rectangle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
        int height=sc.nextInt();
        int breadth=sc.nextInt();
        int area=breadth*height;
        System.out.println("Area of a rectangle  "+area);
	}

}
