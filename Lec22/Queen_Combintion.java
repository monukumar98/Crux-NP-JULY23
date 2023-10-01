package Lec22;

public class Queen_Combintion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		int tq = 2;
		boolean[] board = new boolean[n];
		Combintion(board, 0, tq, "", 0);

	}

	public static void Combintion(boolean[] board, int qpsf, int tq, String ans, int idx) {
		if (qpsf == tq) {
			System.out.println(ans);
			return;
		}
		for (int i = idx; i < board.length; i++) {
			if (board[i] == false) {
				board[i] = true;
				Combintion(board, qpsf + 1, tq, ans + "b" + i + "q" + qpsf, i + 1);
				board[i] = false;
			}
		}

	}

}
