import java.util.*;

public class Fibonacci {
	public void main(String args[]) {
	int n, temp1=0, temp2=1;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the limit of the series:");
	n = sc.nextInt();
	for(int i =1; i<=n; i++) {
		System.out.print(temp1);
		int sum = temp1+temp2;
		temp1 = temp2;
		temp2 = sum;
	}
	}
}
