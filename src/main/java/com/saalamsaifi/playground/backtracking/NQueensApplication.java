package com.saalamsaifi.playground.backtracking;

public class NQueensApplication {
  public static void main(String[] args) {
    var board = new ChessBoard(4);

    board.solve();

    System.out.println(board);
  }
}
