package coding;
import java.util.Scanner;

public class Q1083 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = 1;
		sc.close();
		while(b<=a) {
			if(b%10==3 ||b%10==6||b%10==9) {
				System.out.println('X');
			}
			else {
				System.out.println(b);
			}
			b +=1;
		}
	}

}
