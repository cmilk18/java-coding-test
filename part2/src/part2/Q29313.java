package part2;

import java.util.Scanner;

public class Q29313 {

	public static int v,e;
	public static int[] parent = new int[100001];
	
	public static int findParent(int x) {
		if(x==parent[x]) return x;
		return parent[x] = findParent(parent[x]);
	}
	
	public static void unionParent(int a,int b) {
		a = findParent(a);
		b = findParent(b);
		if(a<b) parent[b] = a;
		else parent[a] = b;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		v = sc.nextInt();
		e = sc.nextInt();
		
		for(int i=1;i <= v;i++) {
			parent[i] = i;
		}
		
		for(int i=0;i<e;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			unionParent(a,b);
		}
		sc.close();
		
		System.out.println("각 원소가 속한 집합");
		for(int i=1;i<=v;i++) {
			System.out.print(findParent(i)+" ");
		}
		System.out.println();
		
		System.out.println("부모 테이블 : ");
		for(int i=1;i<=v;i++) {
			System.out.print(parent[i]+" ");
		}
		System.out.println();
	}

}
