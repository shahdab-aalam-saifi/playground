package com.saalamsaifi.backtracking;

public class NQueen {
	public NQueen() {
		// Private Constructor
	}

	public void solve(ChessBoard board) {
		placeQueens(board, 0);
		System.out.println(board);
	}
	
	private boolean placeQueens(ChessBoard board, int nQueen) {
		if (nQueen == board.getSize()) {
			return true;
		}
		for (int row = 0; row < board.getSize(); row++) {
			if (canPlaceQueen(board, row, nQueen)) {
				board.getBoard()[row][nQueen] = 1;

				if (placeQueens(board, nQueen + 1)) {
					return true;
				}

				board.getBoard()[row][nQueen] = 0;
			}
		}
		return false;
	}

	private boolean canPlaceQueen(ChessBoard board, int row, int col) {
		for (int i = 0; i < board.getSize(); i++) {
			if (board.getBoard()[row][i] == 1) {
				return false;
			}
		}

		for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
			if (board.getBoard()[i][j] == 1) {
				return false;
			}
		}

		for (int i = row, j = col; i < board.getSize() && j >= 0; i++, j--) {
			if (board.getBoard()[i][j] == 1) {
				return false;
			}
		}

		return true;
	}
}
