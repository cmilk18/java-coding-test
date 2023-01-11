package part2;
import java.util.*;

class Node3 implements Comparable<Node3> {

    private int index;
    private int distance;

    public Node3(int index, int distance) {
        this.index = index;
        this.distance = distance;
    }

    public int getIndex() {
        return this.index;
    }

    public int getDistance() {
        return this.distance;
    }

    // 거리(비용)가 짧은 것이 높은 우선순위를 가지도록 설정
    @Override
    public int compareTo(Node3 other) {
        if (this.distance < other.distance) {
            return -1;
        }
        return 1;
    }

	
}
public class Q2912 {

	public static final int INF = (int)1e9;
	
	public static int n,m,start;
	
	public static ArrayList<ArrayList<Node3>> graph = new ArrayList<ArrayList<Node3>>();
	
	public static int[]d = new int[100001];
	
	public static void dijkstra(int start) {
		PriorityQueue<Node3> pq = new PriorityQueue<>();
		
		pq.offer(new Node3(start,0));
		d[start] =0;
		while(!pq.isEmpty()) {
			Node3 node = pq.poll();
			int dist = node.getDistance();
			int now = node.getIndex();
			if(d[now]<dist) continue;
			for(int i=0;i<graph.get(now).size();i++) {
				int cost = d[now] + graph.get(now).get(i).getDistance();
				if(cost<d[graph.get(now).get(i).getIndex()]) {
					d[graph.get(now).get(i).getIndex()]=cost;
					pq.offer(new Node3(graph.get(now).get(i).getIndex(),cost));
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		m=sc.nextInt();
		start = sc.nextInt();
		
		for(int i=0;i<=n;i++) {
			graph.add(new ArrayList<Node3>());
		}
		
		for(int i=0;i<m;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			graph.get(a).add(new Node3(b,c));
		}
		
		sc.close();
		
		Arrays.fill(d, INF);
		
		dijkstra(start);
		
		for(int i=1;i<=n;i++) {
			if(d[i] == INF) {
				System.out.println("INFINITY");
			}
			else {
				System.out.println(d[i]);
			}
		}
	}

}
