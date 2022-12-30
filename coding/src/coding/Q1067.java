package coding;
import java.util.Scanner;

public class Q1067 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		sc.close();
		
		if(a<0) {
			System.out.println("minus");
			
		}else {
			System.out.println("plus");
		}
		
		if(a%2==0) {
			System.out.println("even");
		}else {
			System.out.println("odd");
		}
	}

}
