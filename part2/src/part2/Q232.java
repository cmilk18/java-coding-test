package part2;
import java.util.Arrays;
import java.util.Scanner;

public class Q232 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();
		int[] num = new int[n];
		for(int i=0;i<n;i++) {
			num[i] = sc.nextInt();
		}
		sc.close();
		
		Arrays.sort(num);
		
		int first = num[n-1];
		int second = num[n-2];
		
		int count = (m/(k+1))*k;
		count += m%(k+1);
		
		int result = count*first;
		result += (m-count)*second;
		
		System.out.println(result);
		
		System.out.printf("%d %d %d \n",n,m,k);
		for(int i=0;i<n;i++) {
			System.out.print(num[i]);
		}
	}

}
