package part2;
import java.util.*;

public class Q29316 {

	public static int v,e;
	public static int[] indegree = new int[100001];
	public static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
	
	public static void topologySort() {
		ArrayList<Integer> result = new ArrayList<>();
		Queue<Integer> q = new LinkedList<>();
		
		for(int i=1;i<=v;i++) {
			if(indegree[i]==0) {
				q.offer(i);
			}
		}
		while(!q.isEmpty()) {
			int now = q.poll();
			result.add(now);
			for(int i=0;i<graph.get(now).size();i++) {
				indegree[graph.get(now).get(i)] -= 1;
				
				if(indegree[graph.get(now).get(i)]==0) {
					q.offer(graph.get(now).get(i));
				}
			}
			
		}
		for(int i=0;i<result.size();i++) {
			System.out.println(result.get(i)+" ");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		v=sc.nextInt();
		e=sc.nextInt();
		
		for(int i=0; i <= v; i++) {
			graph.add(new ArrayList<Integer>());
		}
		
		for(int i=0;i<e;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			graph.get(a).add(b);
			indegree[b] += 1;
			
		}
		
		sc.close();
		topologySort();

	}

}
