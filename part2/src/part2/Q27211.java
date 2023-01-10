package part2;

import java.util.Arrays;
import java.util.Scanner;

public class Q27211 {
	
	public static int binarySearch(int[] array,int target,int start,int end) {
		while(start <= end) {
			int mid = (start+end)/2;
			if(array[mid]==target) return mid;
			else if(array[mid]>=target) {
				end = mid -1;
			}
			else {
				start = mid +1;
			}
			
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		
		int m = sc.nextInt();
		
		int[] targets = new int[m];
		for(int i=0;i<m;i++) {
			targets[i] = sc.nextInt();
		}
		sc.close();
		for(int i=0;i<m;i++) {
			int result = binarySearch(arr,targets[i],0,n-1);
			if(result != -1) {
				System.out.println("yes ");
			}else {
				System.out.println("no ");
			}
		}
		
		

	}

}
