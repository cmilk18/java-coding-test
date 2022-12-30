package coding;
import java.util.Scanner;

public class Q1088 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = 0;
		sc.close();
		
		while(b<=a) {
			if(b%3!=0) {
				System.out.println(b);
			}
			b +=1;
		}
	}

}
