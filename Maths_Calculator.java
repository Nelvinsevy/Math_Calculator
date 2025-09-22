package Math_Calculator;
import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;
public class Maths_Calculator {
	
	public static void getMenu() {
		System.out.println("1.Addition");
		System.out.println("2.Substraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Divison");
	}
     public static void main(String[]args) {
    	 Scanner sc=new Scanner(System.in);
    	 System.out.println("--Mathematics Helper--");
    	 char c='y';
    	 while(c=='y') {
    	 System.out.print("Enter the frsit number :");
    	 double a=sc.nextDouble();
    	 System.out.print("Enter the second number :");
    	 double b=sc.nextDouble();
    	 getMenu();
    	 System.out.print("Enter the choice :");

    	 int ch=sc.nextInt();
    	 switch(ch) {
    	 case 1: System.out.println("The sum of "+a+" and "+b+ " is "+(a+b));
    	 break;
    	 case 2:System.out.println("The difference between "+a+" &  "+b+" is "+(b-a));
    	 break;
    	 case 3:System.out.println("The  multiple of "+a+" &  "+b+" is "+(b*a));
    	 break;
    	 case 4 :System.out.println("the difference between "+a+" &  "+b+" is "+(b/a));
    	 break;
    	 default:System.out.println("invalid choice");
    	 }
    	 System.out.println("Do you wanted to continue ? Yes or No");
    	 c=sc.next().charAt(0);
    	 }
    	 sc.close();
     }
}
