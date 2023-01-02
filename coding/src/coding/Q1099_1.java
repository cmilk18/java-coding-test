package coding;
import java.util.Scanner;

public class Q1099_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int[][] miro = new int[10][10];
		
		for (int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
				miro[i][j]=sc.nextInt();
			}
		}
		
		sc.close();
		int x = 2 - 1;
		int y = 2 - 1;
		
		while(true){
			if(miro[x][y]==0) {
				miro[x][y]=9;
			}
			if(miro[x][y]==2) {
				miro[x][y]=9;
				break;
			}
			
			if((miro[x][y+1]==1 && miro[x+1][y]==1) ||(x==9&&y==9)) {
				miro[x][y]=9;
				break;
				
			}
			if(miro[x][y+1]!=1) {
				y+=1;
			}
			else if(miro[x+1][y]!=1) {
				x+=1;
				
			}
		}
		
		
		for (int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
				System.out.print(miro[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}
