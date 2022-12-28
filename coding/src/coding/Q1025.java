package coding;
import java.util.Scanner;

public class Q1025 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();
		
		int b = a / 10000 ;
		int c = (a % 10000) / 1000;
		int d = (a % 1000) / 100;
		int e = (a % 100) / 10;
		int f = a %10;
		
		System.out.println("["+(b*10000)+"]");
		System.out.println("["+(c*1000)+"]");
		System.out.println("["+(d*100)+"]");
		System.out.println("["+(e*10)+"]");
		System.out.println("["+f+"]");
	}

}
