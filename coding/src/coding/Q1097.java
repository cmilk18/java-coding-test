package coding;
import java.util.Scanner;

public class Q1097 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int[][] arr = new int[19][19];
		
		
		for (int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				arr[i][j] = sc.nextInt();
				}
			}

		int total = sc.nextInt();    
		
		for (int i=0;i<total;i++) {
				int x = sc.nextInt()-1;
				int y = sc.nextInt()-1;
				for(int j=0;j<arr.length;j++) {
					if(arr[x][j] == 0) {
						arr[x][j]=1;
					}else {
						arr[x][j]=0;
					}
				}
				for(int k=0;k<arr.length;k++) {
					if(arr[k][y]==0) {
						arr[k][y]=1;
					}else {
						arr[k][y]=0;
					}
				}
				}
		sc.close();
		
		for (int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}


}
