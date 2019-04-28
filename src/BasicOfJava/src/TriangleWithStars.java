import java.util.*;

public class TriangleWithStars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int input;
		System.out.println("Enter input");
		input = sc.nextInt();
		for(int i =0; i<input; i++) {
			for(int j =0; j<=input-i; j++) {
				System.out.print(" ");
			}
			for(int k =0; k<=i; k++) {
			System.out.print("* ");
			}
			System.out.println();
		}
		sc.close();

	}

}
