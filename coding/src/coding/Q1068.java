package coding;
import java.util.Scanner;

public class Q1068 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		sc.close();
		
		if(a>=90) {
			System.out.println("A");
			
		}
		else if(a>=70){
			System.out.println("B");
		}
		else if(a>=40) {
			System.out.println("C");
		}
		else {
			System.out.println("D");
		}	
	}
}
