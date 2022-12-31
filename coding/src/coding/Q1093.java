package coding;
import java.util.Scanner;

public class Q1093 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int total = sc.nextInt();
		//String num = sc.nextLine();
		//int[] number = new int[total];
		int[] name = new int[24];
		
		
		//이름 불리면 1추가
		for (int i=0;i<total;i++) {
			int num = sc.nextInt();
			name[num-1] += 1;
		}
		sc.close();
		
		//출력
		for(int i=0;i<23;i++) {
			System.out.print(name[i]+" ");
		}
	}

}
