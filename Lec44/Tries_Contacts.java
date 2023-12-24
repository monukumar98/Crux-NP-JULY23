package Lec44;

import java.util.HashMap;

public class Tries_Contacts {
	class Node {
		char ch;
		HashMap<Character, Node> child = new HashMap<>();
		boolean isterminal = false;
		int c = 0;

	}

	private Node root;

	public Tries_Contacts() {
		// TODO Auto-generated method stub
		Node nn = new Node();
		nn.ch = '*';
		root = nn;

	}

	public void insert(String word) {
		Node curr = root;
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			if (curr.child.containsKey(ch)) {
				curr = curr.child.get(ch);
				curr.c = curr.c + 1;
			} else {
				Node node = new Node();
				node.ch = ch;
				node.c = 1;
				curr.child.put(ch, node);
				curr = node;
			}
		}
		curr.isterminal = true;

	}

	public int startsWith(String prefix) {
		Node curr = root;
		for (int i = 0; i < prefix.length(); i++) {
			char ch = prefix.charAt(i);
			if (curr.child.containsKey(ch)) {
				curr = curr.child.get(ch);
			} else {
				return 0;
			}
		}
		return curr.c;
	}

	public static void main(String[] args) {
		Tries_Contacts t = new Tries_Contacts();
		t.insert("hack");
		t.insert("hackerrank");
		System.out.println(t.startsWith("hac"));
		System.out.println(t.startsWith("hak"));
	}

}
