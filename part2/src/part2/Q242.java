package part2;
import java.util.Scanner;

public class Q242 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String data = sc.nextLine();
		int row = data.charAt(1) - '0';
		int column = data.charAt(0) - 'a' +1;
		sc.close();
		
		int[] dx = {-2,-2,-1,-1,1,1,2,2};
		int[] dy = {-1,1,-2,2,-2,2,-1,1};
		
		int result = 0;
		
		for(int i=0;i<dx.length;i++) {
			int nextrow = row + dx[i];
			int nextcolumn = column + dy[i];
			if(nextrow>=1 && nextrow<=8 && nextcolumn>=1 && nextcolumn <=8 ) {
				result+=1;
			}
		}
		System.out.println(result);
	}

}
