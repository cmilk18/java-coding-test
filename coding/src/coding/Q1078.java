package coding;
import java.util.Scanner;

public class Q1078 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();
		int b = 0;
		int c = 0;
		while(b<=a) {
			if (b%2==0){
				c += b;
			}
			b +=1;
		}
		System.out.println(c);
	}

}
