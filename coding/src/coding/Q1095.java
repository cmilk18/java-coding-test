package coding;
import java.util.Scanner;

public class Q1095 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int total = sc.nextInt();
		int[] arr = new int[total];
		int small = 100;
		
		
		for(int i=0;i<total;i++) {
			arr[i] = sc.nextInt();
			if(small>arr[i]) {
				small=arr[i];
			}
		}
		sc.close();
		System.out.println(small);
	}

}
