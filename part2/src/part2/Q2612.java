package part2;

public class Q2612 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		int[]arr = {7,5,9,0,3,1,6,2,4,8};
		
		for(int i=0;i<n;i++) {
			//인덱스 i부터 1까지 감소하며 반복하는 문법
			for(int j=i;j>0;j--) {
				//한칸씩 왼쪽으로 이동
				if(arr[j]<arr[j-1]) {
					//스와프
					int temp = arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
				}else {
					//자기보다 작으면 멈춤
					break;
				}
			}
		}
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
	}
	}

}
