package com.saalamsaifi.backtracking;

public class ChessBoard {
	private int[][] board;
	private int size;

	public ChessBoard(int size) {
		this.size = size;
		this.board = new int[this.size][this.size];
	}

	public int getSize() {
		return size;
	}

	public int[][] getBoard() {
		return board;
	}

	@Override
	public String toString() {
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
