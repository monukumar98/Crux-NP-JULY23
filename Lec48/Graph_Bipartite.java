package Lec48;

import java.util.*;
import java.util.Queue;

public class Graph_Bipartite {

	class Solution {
		public boolean isBipartite(int[][] graph) {
			Queue<BipartitePair> q = new LinkedList<>();
			HashMap<Integer, Integer> visited = new HashMap<>();

			for (int src = 0; src < graph.length; src++) {
				if (visited.containsKey(src)) {
					continue;
				}
				q.add(new BipartitePair(src, 0));
				while (!q.isEmpty()) {
					// 1. remove
					BipartitePair bp = q.remove();

					// 2. Ignore if Already visited
					if (visited.containsKey(bp.v)) {
						if (visited.get(bp.v) != bp.d) {
							return false;
						}
						continue;
					}
					// 3. Marked visited
					visited.put(bp.v, bp.d);

					// 4.self work

					// Add unvisited nbrs
					for (int nbrs : graph[bp.v]) {
						if (!visited.containsKey(nbrs)) {
							q.add(new BipartitePair(nbrs, bp.d + 1));
						}
					}
				}
			}
			return true;
		}

		class BipartitePair {
			int v;
			int d;

			public BipartitePair(int v, int d) {
				// TODO Auto-generated constructor stub
				this.v = v;
				this.d = d;
			}
		}
	}

}
