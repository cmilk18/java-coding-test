package coding;
import java.util.Scanner;

public class Q1018 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		String h;
		String m;
		
		String input = sc.next();
		String[] time =input.split(":");
		
		h = time[0];
		m = time[1];
		sc.close();
		System.out.println(h+":"+m);
	}

}
