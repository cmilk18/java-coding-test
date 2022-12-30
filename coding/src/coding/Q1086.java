package coding;
import java.util.Scanner;

public class Q1086 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextInt();
		double b = sc.nextInt();
		double c = sc.nextInt();
		
		double e = (a*b*c)/8/1024/1024;
		sc.close();
		System.out.printf("%.2f MB",e);
		}

}
