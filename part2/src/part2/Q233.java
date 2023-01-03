package part2;
import java.util.Arrays;
import java.util.Scanner;

public class Q233 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] num = new int[n][m];
		int[] min = new int[n];
		int max = 0;
		
		//배열 생성
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				num[i][j]=sc.nextInt();
			}
		}
		sc.close();
		
		//최소값 구하기
		for(int i=0;i<n;i++) {
			Arrays.sort(num[i]);
			min[i] = num[i][0];
		}
		//최대값 구하기
		for(int i=0;i<n;i++) {
			if(max<min[i]) {
				max=min[i];
			}
		}
		System.out.println(max);
		
		
	}

}
