package part2;
import java.util.Scanner;

public class Q2824 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		sc.close();
		
		int[] d = new int[1000];
		
		d[1]=1;
		d[2]=3;
		
		for (int i=3;i<n+1;i++){
			d[i] = (d[i-1] + 2 * d[i-2])%796796;
		}
		System.out.println(d[n]);
	}

}
