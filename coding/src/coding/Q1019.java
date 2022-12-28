package coding;
import java.util.Scanner;

public class Q1019 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int y,m,d;
		String a,b,c;
		Scanner sc = new Scanner(System.in);
		
		String input = sc.next();
		//System.out.println("input " + input);
		sc.close();
		
		String[] time = input.split("\\.");
		//System.out.println("time"+time[0]);
		
		//String input = sc.next();
		//String[] time =input.split(":");
		
		a = time[0];
		b = time[1];
		c = time[2];
		
		y=Integer.parseInt(a);
		m=Integer.parseInt(b);
		d=Integer.parseInt(c);
		
		System.out.printf("%04d.%02d.%02d",y,m,d);
		/*
		System.out.printf("%04d",y);
		System.out.printf("%02d",m);
		System.out.print(".");
		System.out.printf("%02d",d);
		*/
	}

}
