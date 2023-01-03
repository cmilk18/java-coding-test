package part2;
import java.util.*;

public class Q234 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 long beforeTime = System.currentTimeMillis();

		Scanner sc = new Scanner(System.in);
		//int n = sc.nextInt();
		//int m = sc.nextInt();
		int n = 25;
        int m= 3;
		sc.close();
		
		while(n>1) {
			if(n%m==0) {
				n /= m;
			}else {
				n -= 1;
			}
			//System.out.println(n);
		}
		
		System.out.println(n);
		
		long afterTime = System.currentTimeMillis();
	    long secDiffTime = (afterTime - beforeTime);
	    System.out.println("시간차이"+secDiffTime);
	}

	
}
