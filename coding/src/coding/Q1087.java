package coding;
import java.util.Scanner;

public class Q1087 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b=0, c=0;
		
		while(b<a) {
			c+=1;
			b+=c;
		}
		System.out.println(b);
	}

}
