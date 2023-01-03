package part2;

public class Q231 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =1260;
		
		int[] coin = {500, 100, 50, 10};
		
		int result = 0;
		for(int i=0;i<coin.length;i++) {
			result += (int)(n / coin[i]);
			n %= coin[i];
			System.out.println(result);
		}
		System.out.println(result);
		
	}

}
