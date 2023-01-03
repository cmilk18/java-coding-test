package part2;
import java.util.Scanner;

public class Q2411 {

	public static boolean check(int h,int m, int s) {
		if(h%10==3|| m/10==3 || m%10==3 || s/10==3 || s%10==3) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		sc.close();
		int count =0;
		
		for (int i=0;i<h+1;i++) {
			for (int j=0;j<60;j++) {
				for (int k=0;k<60;k++) {
					if(check(i,j,k)) {
						count += 1;
					}
				}
			}
		}
		System.out.println(count);
	}

}
