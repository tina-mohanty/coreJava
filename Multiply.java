import java.util.Scanner;

public class Multiply {
	public void main(String args[]) {
		int num1, num2;
		Scanner sc = new Scanner(System.in);
		
	System.out.println("enter first number: ");
	num1 = sc.nextInt();
	
	System.out.println("enter second number: ");
	num2 = sc.nextInt();
	
	int product = num1 * num2;
	
	System.out.println("Output: "+product);
	
	
	}

}
