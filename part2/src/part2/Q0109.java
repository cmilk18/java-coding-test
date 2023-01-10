package part2;


public class Q0109 {
	public static final int MAX_VALUE = 9;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 10;
		int[] arr = {9,8,2,4,3,5,1,6,1,0};
		int[] cnt = new int[MAX_VALUE+1];
		for (int i=0;i<n;i++) {
			cnt[arr[i]]+= 1;
		}
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<cnt[i];j++) {
				System.out.print(i+" ");
			}
		}
		
		
		for(int i=0;i<n;i++) {
			System.out.print(cnt[i]+" ");
		}
	}

}
