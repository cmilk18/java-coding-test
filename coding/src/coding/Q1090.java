package coding;
import java.util.Scanner;

public class Q1090 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		//int d = a;
		sc.close();
		
		for(int i=1;i<c;i++) {
			a *=b;
			//System.out.println(a);
		}
		System.out.println(a);
		
	}

}
