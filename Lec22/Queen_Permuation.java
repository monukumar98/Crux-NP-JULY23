package Lec22;

public class Queen_Permuation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		int tq = 2;
		boolean[] board = new boolean[n];
		Permuation(board, 0, tq, "");

	}

	public static void Permuation(boolean[] board, int qpsf, int tq, String ans) {
		if (qpsf == tq) {
			System.out.println(ans);
			return;
		}
		for (int i = 0; i < board.length; i++) {
			if (board[i] == false) {
				board[i] = true;
				Permuation(board, qpsf + 1, tq, ans + "b" + i + "q" + qpsf);
				board[i] = false;
			}
		}

	}
}
