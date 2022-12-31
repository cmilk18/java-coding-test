package coding;
import java.util.Scanner;

public class Q1092 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();
		int d = 1;
		
		while(d%a != 0 || d%b != 0 || d%c != 0) {
			d +=1;
			
		}
		System.out.println(d);
	}

}
