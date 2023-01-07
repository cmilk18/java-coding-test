package part2;

public class Q2614 {
	
	public static final int MAX_VALUE = 9;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 10;
		int[]arr = {7,5,9,0,3,1,6,2,4,8};
		
		int[] cnt = new int[MAX_VALUE+1];
		
		for(int i=0;i<n;i++) {
			cnt[arr[i]]+=1;
		}
		for(int i=0;i <=MAX_VALUE;i++) {
			for(int j=0;j<cnt[i];j++) {
				System.out.print(i+" ");
			}
		}
	}

}
