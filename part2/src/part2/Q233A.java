package part2;
import java.util.*;

public class Q233A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int result = 0;
		
		for(int i=0;i<n;i++) {
			int min_value=10000;
			for(int j=0;j<m;j++) {
				int x = sc.nextInt();
				min_value=Math.min(min_value, x);
			}
			result = Math.max(min_value, result);
		}
		sc.close();
		System.out.println(result);
	}

}
