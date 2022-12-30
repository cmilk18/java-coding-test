package coding;
import java.util.Scanner;

public class Q1089 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		//int d = a;
		sc.close();
		
		for(int i=1;i<c;i++) {
			a +=b;
			//System.out.println(d);
		}
		System.out.println(a);
		
	}

}
