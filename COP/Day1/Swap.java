import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the first number");
		a= sc.nextInt();
		System.out.println("enter the second number");
		b= sc.nextInt();
		c=a;
		a=b;
		b=c;
		System.out.println("after swapping");
		System.out.println("the first number is " +a);
		System.out.println("the second number is " +b);
		sc.close();
	}

}
