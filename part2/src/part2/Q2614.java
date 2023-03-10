package part2;

public class Q2614 {
	//퀵정렬
	public static void quick_sort(int[] arr,int start,int end) {
		if(start>=end) {
			return;
		}
		int pivot = start;
		int left = start+1;
		int right = end;
		while (left <= right){
			while(left <= end && arr[left]<= arr[pivot]) {
				left+=1;
			}
			while(right>start && arr[right]>=arr[pivot]) {
				right -= 1;
			}
			if(left>right) {
				int temp = arr[right];
				arr[right]=arr[pivot];
				arr[pivot]=temp;
			}else {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
			}
			
		}
		quick_sort(arr,start,right-1);
		quick_sort(arr,right+1,end);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 10;
		int[]arr = {7,5,9,0,3,1,6,2,4,8};
	
		quick_sort(arr,0,n-1);
		
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
		
	}

}
