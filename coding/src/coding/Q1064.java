package coding;
import java.util.Scanner;

public class Q1064 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();
		
		if(a>b) {
			if(b>c) {
				System.out.println(c);
			}
			else {
				System.out.println(b);
			}
		}
		else {
			if(a>c) {
				System.out.println(c);
			}
			else {
				System.out.println(a);
			}
		}
	}

}
