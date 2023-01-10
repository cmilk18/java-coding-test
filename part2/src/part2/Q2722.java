package part2;

import java.util.Scanner;

public class Q2722 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] arr = new int [n];
		
		
		int start = 0;
		int end = 100;
		int result =0;
		
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		while(start <= end) {
			int total =0;
			int mid = (start+end)/2;
			for(int i=0;i<arr.length;i++) {
				if(arr[i]>mid) {
					total+=arr[i]-mid;
				}
				}
			if(total < m) {
				end = mid -1;
			}else {
				result = mid;
				start = mid +1;
			}
		}
		System.out.println(result);

	}

}
