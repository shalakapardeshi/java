import java.util.Scanner;

public class GreatestNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2,num3;
		Scanner sc= new Scanner(System.in);
	   System.out.println("enter the first number");
	   num1= sc.nextInt();
	   System.out.println("enter the second number");
	   num2= sc.nextInt();
	   System.out.println("enter the third number");
	   num3= sc.nextInt();
if(num1>=num2 && num1>=num3)
	System.out.println("the greatest number is "+num1);
else if(num2>=num1 && num2>=num3)
	System.out.println("the greatest number is "+num2);
else
	System.out.println("the gratest number is "+num3);
sc.close();
	}

}
