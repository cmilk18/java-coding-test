package coding;
import java.util.Scanner;

public class Q1027 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		sc.close();
		
		String[]b =a.split("\\.");
		int y = Integer.parseInt(b[0]);
		int m = Integer.parseInt(b[1]);
		int d = Integer.parseInt(b[2]);
		System.out.printf("%02d-%02d-%04d",d,m,y);
	}

}
