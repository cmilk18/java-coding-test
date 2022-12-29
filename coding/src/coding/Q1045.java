package coding;
import java.util.Scanner;

public class Q1045 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		
		sc.close();
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		float c = (float)a;
		float d = (float)b;
		System.out.printf("%.02f",c/d);
		
		
	}

}
