package algorithm_cmilk;

import java.util.ArrayList;
import java.util.Scanner;

public class _2_Eratos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Boolean> primeList;
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		//1은 소수가 아님!
		if(n <= 1) return;
		
		//n+1만큼 할당
		primeList = new ArrayList<Boolean>(n+1);
		
		//0번째와 1번째를 소수 아님으로 처리
		primeList.add(false);
		primeList.add(false);
		
		//2~n까지 소수로 설정
		for(int i=2;i<=n;i++) {
			primeList.add(i,true);
		}
		
		//2부터 ~ i*i <= n 배수 삭제
		for(int i=2;(i*i)<=n;i++) {
			if(primeList.get(i)) {
				for(int j= i*i;j<=n;j+=i) {
					primeList.set(j, false);
					//i*i미만은 이미 처리
				}
			}
		}
		StringBuffer sb = new StringBuffer();
		sb.append("{");
		for(int i=0; i<=n; i++) {
			if(primeList.get(i)==true) {
				sb.append(i);
				sb.append(",");
			}
		}
		sb.setCharAt(sb.length()-1, '}');
		
		System.out.println(sb.toString());
		
		
		
	}

}
