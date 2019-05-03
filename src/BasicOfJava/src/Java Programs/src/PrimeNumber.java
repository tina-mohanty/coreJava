import java.util.*;

public class PrimeNumber {

	public static void main(String[] args) {
		int n;
		boolean flag = false;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		n = sc.nextInt();
		
		for(int i =2; i<= n/2; i++) {
			if(n%i ==0) {
				flag = true;
				return;
			}
		}
		if(!flag) {
			System.out.print("Prime");
		}
		else{
			System.out.print("Not Prime");
		}
	}

}
