package coding;
import java.util.Scanner;

public class Q1091 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		long d = sc.nextLong();
		
		sc.close();
		
		for(int i=1;i<d;i++) {
			a *=b;
			a +=c;
			//System.out.println(a);
		}
		System.out.println(a);
		
	}

}
