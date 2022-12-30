package coding;
import java.util.Scanner;

public class Q1082 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		int b = Integer.parseInt(a,16);
		sc.close();
		
		for(int i=1;i<16;i++) {
			String j =Integer.toHexString(i).toUpperCase();
			String k =Integer.toHexString(b*i).toUpperCase();
			System.out.printf("%s*%s=%s \n",a,j,k);
		}
	}

}
