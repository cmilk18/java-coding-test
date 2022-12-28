package coding;
import java.util.Scanner;

public class Q1024 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String[] b = a.split("");
		sc.close();
		
		for (int i= 0 ; i<b.length;i++)
			System.out.println("'"+b[i]+"'");
		
	}

}
