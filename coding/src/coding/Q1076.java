package coding;
import java.util.Scanner;

public class Q1076 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		char a = sc.next().charAt(0);
		
		char b = 'a';
		
		sc.close();
		while(b<=a) {
			System.out.print(b+" ");
			b+=1;
		}
	}

}
