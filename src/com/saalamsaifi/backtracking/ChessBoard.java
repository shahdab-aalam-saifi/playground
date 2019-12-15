package com.saalamsaifi.backtracking;

public class ChessBoard {
	private int[][] board;
	private int size;
	private boolean solve;

	public ChessBoard(int size) {
		this.size = size;
		this.board = new int[this.size][this.size];
		this.solve = false;
	}

	public int getSize() {
		return size;
	}

	public int[][] getBoard() {
		return board;
	}

	public boolean isSolved() {
		return this.solve;
	}

	public void solve() {
		this.solve = true;
		NQueen.getInstance().solve(this);
	}

	@Override
	public String toString() {
		if (!this.solve) {
			System.out.println("Chess board is unsolved yet.");
			return "";
		}

		StringBuilder builder = new StringBuilder();
		for (int row = 0; row < this.size; row++) {
			for (int col = 0; col < this.size; col++) {
				if (this.board[row][col] == 1) {
					builder.append("[Q]");
				} else {
					builder.append("[ ]");
				}
			}
			builder.append("\n");
		}
		return builder.toString();
	}
}
