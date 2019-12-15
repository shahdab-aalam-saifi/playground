package com.saalamsaifi.backtracking;

public class NQueensApplication {
	public static void main(String[] args) {
		ChessBoard board = new ChessBoard(4);

		board.solve();

		System.out.println(board);
	}
}
