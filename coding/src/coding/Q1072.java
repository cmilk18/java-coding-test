package coding;
import java.util.Scanner;

public class Q1072 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int[] b = new int[a]; 
		
		for (int i=0;i<a;i++) {
			b[i]=sc.nextInt();
			System.out.println(b[i]);
		}
		sc.close();
	}

}
