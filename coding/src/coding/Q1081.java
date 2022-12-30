package coding;
import java.util.Scanner;

public class Q1081 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b= sc.nextInt();
		sc.close();
		for(int i=1;i<=a;i++) {
			for(int j=1;j<=b;j++) {
				System.out.printf("%d %d \n",i,j);
				
			}
		}
	}

}
