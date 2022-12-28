package coding;
import java.util.Scanner;

public class Q1020 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		String[] number = input.split("-");
		sc.close();
		
		String a = number[0];
		String b = number[1];
		
		int f = Integer.parseInt(a);
		int s = Integer.parseInt(b);
		
		System.out.printf("%06d%07d",f,s);
	}

}
