package Lec48;

import java.util.*;

public class Graph_Valid_Tree {

	class Solution {
		public boolean validTree(int n, int[][] edges) {
			HashMap<Integer, List<Integer>> map = new HashMap<>();
			for (int i = 0; i < n; i++) {
				map.put(i, new ArrayList<>());
			}
			for (int i = 0; i < edges.length; i++) {
				int v1 = edges[i][0];
				int v2 = edges[i][1];
				map.get(v1).add(v2);
				map.get(v2).add(v1);
			}

			return BFT(map);

		}

		public boolean BFT(HashMap<Integer, List<Integer>> map) {
			Queue<Integer> q = new LinkedList<>();
			HashSet<Integer> visited = new HashSet<>();
			int c = 0;
			for (int src : map.keySet()) {
				if (visited.contains(src)) {
					continue;
				}
				c++;
				q.add(src);
				while (!q.isEmpty()) {
					// 1. remove
					int v = q.remove();

					// 2. Ignore if Already visited
					if (visited.contains(v)) {
						return false;
					}
					// 3. Marked visited
					visited.add(v);

					// 4.self work

					// Add unvisited nbrs
					for (int nbrs : map.get(v)) {
						if (!visited.contains(nbrs)) {
							q.add(nbrs);
						}
					}
				}
			}
			return c == 1;
		}
	}

}
