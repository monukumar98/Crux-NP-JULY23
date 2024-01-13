package Lec49;

import java.util.*;

public class Prims_Algo {
	HashMap<Integer, HashMap<Integer, Integer>> map;

	public Prims_Algo(int v) {
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

	class PrimsPair {
		int vtx;
		int acqvtx;
		int cost;

		public PrimsPair(int vtx, int acqvtx, int cost) {
			// TODO Auto-generated constructor stub
			this.vtx = vtx;
			this.cost = cost;
			this.acqvtx = acqvtx;
		}

		public String toString() {
			return vtx + " " + acqvtx + " @ " + cost;
		}
	}

	public int Prims() {
		PriorityQueue<PrimsPair> pq = new PriorityQueue<>(new Comparator<PrimsPair>() {

			@Override
			public int compare(PrimsPair o1, PrimsPair o2) {
				// TODO Auto-generated method stub
				return o1.cost - o2.cost;
			}
		});
		HashSet<Integer> visited = new HashSet<>();
		pq.add(new PrimsPair(1, 1, 0));
		int ans = 0;
		while (!pq.isEmpty()) {
			// 1 .remove
			PrimsPair rp = pq.poll();
			// 2. ingore if Alreay visited
			if (visited.contains(rp.vtx)) {
				continue;
			}
			// 3. Marked visited
			visited.add(rp.vtx);
			// 4. self work
			System.out.println(rp);
			ans += rp.cost;
			// 5 add unvisited nbrs
			for (int nbrs : map.get(rp.vtx).keySet()) {
				if (!visited.contains(nbrs)) {
					int cost = map.get(rp.vtx).get(nbrs);
					pq.add(new PrimsPair(nbrs, rp.vtx, cost));
				}
			}

		}
		return ans;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();// vtx
		Prims_Algo pr = new Prims_Algo(n);
		int m = sc.nextInt();// edge
		for (int i = 1; i <= m; i++) {
			int v1 = sc.nextInt();
			int v2 = sc.nextInt();
			int cost = sc.nextInt();
			pr.AddEdge(v1, v2, cost);
		}
		System.out.println(pr.Prims());

	}

}
