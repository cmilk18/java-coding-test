package coding;
import java.util.Scanner;

public class Q1033 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();
		String b = Integer.toString(a,16).toUpperCase();
		System.out.println(b);
	}

}
