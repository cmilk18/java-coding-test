package algorithm_cmilk;

public class _1_prime_number {
	
	public static boolean prime(int x) {
		int y = (int) Math.sqrt(x);
		for (int i=2;i<y+1;i++) {
			if(x%i==0) {
				return false;
			}
			
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(prime(4));
		System.out.println(prime(7));
		
	}

}
