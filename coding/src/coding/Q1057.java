package coding;
import java.util.Scanner;

public class Q1057 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		sc.close();
		if(a==1 && b==1) {
			System.out.println(1);
		}
		else if(a== 0 && b==0) {
			System.out.println(1);
		}
		else {
			System.out.println(0);
		}
	}

}
