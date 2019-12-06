package com.saalamsaifi.backtracking;

public class NQueensApplication {
	public static void main(String[] args) {
		ChessBoard board = new ChessBoard(3);
		new NQueen().solve(board);
	}
}
