package Lec48;

import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;

public class Dijkstra_Algo {

	HashMap<Integer, HashMap<Integer, Integer>> map;

	public Dijkstra_Algo(int v) {
		// TODO Auto-generated constructor stub
		map = new HashMap<>();
		for (int i = 1; i <= v; i++) {
			map.put(i, new HashMap<>());
		}
	}

	public void AddEdge(int v1, int v2, int cost) {
		map.get(v1).put(v2, cost);
		map.get(v2).put(v1, cost);
	}

	class DijkstraPair {
		int v;
		int cost;
		String acqpath;

		public DijkstraPair(int v, int cost, String acqpath) {
			// TODO Auto-generated constructor stub
			this.v = v;
			this.cost = cost;
			this.acqpath = acqpath;
		}

		public String toString() {
			return this.v + " " + this.acqpath + " @ " + this.cost;
		}
	}

	public void Dijkstra(int src) {
		PriorityQueue<DijkstraPair> pq = new PriorityQueue<>(new Comparator<DijkstraPair>() {

			@Override
			public int compare(DijkstraPair o1, DijkstraPair o2) {
				// TODO Auto-generated method stub
				return o1.cost - o2.cost;
			}
		});
		HashSet<Integer> visited = new HashSet<>();
		pq.add(new DijkstraPair(src, 0, "" + src));
		while (!pq.isEmpty()) {
			// 1 .remove
			DijkstraPair rp = pq.poll();
			// 2. ingore if Alreay visited
			if (visited.contains(rp.v)) {
				continue;
			}
			// 3. Marked visited
			visited.add(rp.v);
			// 4. self work
			System.out.println(rp);

			// 5 add unvisited nbrs
			for (int nbrs : map.get(rp.v).keySet()) {
				if (!visited.contains(nbrs)) {
					int cost = map.get(rp.v).get(nbrs);
					pq.add(new DijkstraPair(nbrs, rp.cost + cost, rp.acqpath + nbrs));
				}
			}
		}

	}

	public static void main(String[] args) {
		Dijkstra_Algo g = new Dijkstra_Algo(7);
		g.AddEdge(1, 4, 6);
		g.AddEdge(1, 2, 10);
		g.AddEdge(2, 3, 7);
		g.AddEdge(3, 4, 5);
		g.AddEdge(4, 5, 1);
		g.AddEdge(5, 6, 4);
		g.AddEdge(7, 5, 2);
		g.AddEdge(6, 7, 3);
		g.Dijkstra(1);
	}

}
