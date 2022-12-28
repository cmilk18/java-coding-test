package coding;
import java.util.Scanner;

public class Q1026 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		sc.close();
		
		String[]b =a.split(":");
		int c = Integer.parseInt(b[1]);
		System.out.printf("%d",c);
	}

}
