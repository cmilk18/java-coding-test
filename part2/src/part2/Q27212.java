package part2;

import java.util.Scanner;

public class Q27212 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[]arr = new int [100];
		
		for(int i=0;i<n;i++) {
			int x = sc.nextInt();
			arr[x] =1;
		}
		int m = sc.nextInt();
		int[] targets = new int[n];
		
		for(int i=0;i<m;i++) {
			targets[i] = sc.nextInt();
		}
		sc.close();
		
		for(int i=0;i<m;i++) {
			if(arr[targets[i]]==1) {
				System.out.print("yes ");
			}
			else {
				System.out.print("no ");
			}
		}
		
			
		
		
		

	}

}
