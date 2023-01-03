package part2;
import java.util.Scanner;

public class Q241 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = 1;
		int y = 1;
		int nx = 0;
		int ny = 0;
		
		char[] plans = new char[6];
		
		int[] dx = {0,0,-1,1};
		int[] dy = {-1,1,0,0};
		char[] types = {'L','R','U','D'};
		
		for(int i=0;i<plans.length;i++) {
			plans[i]=sc.next().charAt(0);
		}
		
		sc.close();
		
		for(int i=0;i<plans.length;i++) {
			for(int j=0;j<types.length;j++) {
				if(plans[i] == types[j]) {
					nx = x + dx[j];
					ny = y + dy[j];
				}
				if(nx<1 || ny<1 ||nx>n||ny>n) {
					continue;
				}
				x = nx;
				y= ny;
			}
		}
		System.out.printf("%d %d",x,y);
		
		
	}

}
