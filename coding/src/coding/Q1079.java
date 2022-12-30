package coding;
import java.util.Scanner;

public class Q1079 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		while (true) {
			char a = sc.next().charAt(0);
			System.out.println(a);
			if(a == 'q') {
				break;
			}
		}
		sc.close();
	}

}
