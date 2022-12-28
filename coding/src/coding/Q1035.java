package coding;
import java.util.Scanner;

public class Q1035 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		sc.close();
		int b = Integer.parseInt(a,16);
		a = Integer.toOctalString(b);
		System.out.printf(a);
	}

}
