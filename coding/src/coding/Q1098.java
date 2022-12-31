package coding;
import java.util.Scanner;

public class Q1098 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
	
		int h = sc.nextInt();
		int w= sc.nextInt();
		int[][]m =new int[h][w];
		for (int i=0;i<h;i++) {
			for(int j=0;j<w;j++) {
				m[i][j]=0;
			}
		}
		int n = sc.nextInt();
		
		for(int i=0;i<n;i++) {
			int l = sc.nextInt();
			int d = sc.nextInt();
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			if(d==0) {
				for(int j=0;j<l;j++) {
					m[x-1][y-1+j]=1;
				}
			}else {
				for(int j=0;j<l;j++) {
					m[x-1+j][y-1]=1;
				}
			}
		}
		sc.close();
		for (int i=0;i<h;i++) {
			for(int j=0;j<w;j++) {
				System.out.print(m[i][j]+" ");
			}
			System.out.println();
		}
		
		

	}
}
