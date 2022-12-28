package coding;
import java.util.Scanner;

public class Q1023 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String a = sc.next();
		sc.close();
		String[]b = a.split("\\.") ;
		a = b[0];
		String c = b[1];
		System.out.println(a);
		System.out.println(c);
		
	}

}
