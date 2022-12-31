package coding;
import java.util.Scanner;

public class Q1096 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int total = sc.nextInt();
		int[][] arr = new int[20][20];
		
		
		for (int i=0;i<20;i++) {
			for(int j=0;j<20;j++) {
				arr[i][j] = 0;
				}
			}
		
		for (int i=0;i<total;i++) {
				int x = sc.nextInt();
				int y = sc.nextInt();
				arr[x][y] = 1;
				}
		sc.close();
		
		for (int i=1;i<20;i++) {
			for(int j=1;j<20;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}


}
