package part2;

public class Q2514 {
	
	public static void recursiveFunction(int i) {
		if(i == 100)return;
		System.out.println(i + "번째 재귀 함수에서"+ (i+1)+"번째 재귀함수를 호출");
		recursiveFunction(i+1);
		System.out.println(i+"번째 재귀 함수를 종료합니다");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		recursiveFunction(1);
	}

}
