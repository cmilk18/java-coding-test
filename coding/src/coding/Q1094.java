package coding;
import java.util.Scanner;

public class Q1094 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int[] arr = new int[a];
		
		for (int i=0;i<a;i++) {
			int b = sc.nextInt();
			arr[i] = b;
		}
		sc.close();
		
		for(int i=a-1;i>-1;i--) {
			System.out.print(arr[i]+" ");
		}
	}

}
