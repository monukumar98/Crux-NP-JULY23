package Lec48;

import java.util.*;

public class Graph_2 {
	HashMap<Integer, HashMap<Integer, Integer>> map;

	public Graph_2(int v) {
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

	public void BFT() {
		Queue<Integer> q = new LinkedList<>();
		HashSet<Integer> visited = new HashSet<>();
		for (int src : map.keySet()) {
			if (visited.contains(src)) {
				continue;
			}
			q.add(src);
			while (!q.isEmpty()) {
				// 1. remove
				int v = q.remove();

				// 2. Ignore if Already visited
				if (visited.contains(v)) {
					continue;
				}

				// 3. Marked visited
				visited.add(v);

				// 4.self work
				System.out.print(v + " ");

				// Add unvisited nbrs
				for (int nbrs : map.get(v).keySet()) {
					if (!visited.contains(nbrs)) {
						q.add(nbrs);
					}
				}
			}
		}
		System.out.println();
	}

	public void DFT() {
		Stack<Integer> s = new Stack<>();
		HashSet<Integer> visited = new HashSet<>();
		for (int src : map.keySet()) {
			if (visited.contains(src)) {
				continue;
			}
			s.push(src);
			while (!s.isEmpty()) {
				// 1. remove
				int v = s.pop();
				// 2. Ignore if Already visited
				if (visited.contains(v)) {
					continue;
				}
				// 3. Marked visited
				visited.add(v);

				// 4.self work
				System.out.print(v + " ");
				// Add unvisited nbrs
				for (int nbrs : map.get(v).keySet()) {
					if (!visited.contains(nbrs)) {
						s.push(nbrs);
					}
				}
			}
		}
		System.out.println();

	}

	public static void main(String[] args) {
		Graph_2 g = new Graph_2(7);
		g.AddEdge(1, 4, 6);
		g.AddEdge(1, 2, 10);
		g.AddEdge(2, 3, 7);
		g.AddEdge(3, 4, 5);
		g.AddEdge(4, 5, 1);
		g.AddEdge(5, 6, 4);
		g.AddEdge(7, 5, 2);
		g.AddEdge(6, 7, 3);
		g.BFT();
		g.DFT();
	}

}
