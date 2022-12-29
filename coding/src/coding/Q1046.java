package coding;
import java.util.Scanner;

public class Q1046 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		float a = sc.nextFloat();
		float b = sc.nextFloat();
		float c = sc.nextFloat();
		sc.close();
		
		System.out.printf("%.0f\n",a+b+c);
		System.out.printf("%.1f",(a+b+c)/3);
	}

}
