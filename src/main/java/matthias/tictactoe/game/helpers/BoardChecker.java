package matthias.tictactoe.game.helpers;

import matthias.tictactoe.game.model.Board;
import matthias.tictactoe.game.model.Symbol;

public class BoardChecker {

    private static int[][] WINNING_COMBINATIONS = new int[][]{{0,1,2}, {3,4,5}, {6,7,8}, {0,3,6}, {1,4,7}, {2,5,8}, {0,4,8}, {2,4,6}};

    public static boolean win(Board board) {
        Symbol[] boardArr = board.as1DimArray();

        for(int[] c : WINNING_COMBINATIONS) {
            if(boardArr[c[0]] != Symbol.EMPTY &&
                    boardArr[c[0]] == boardArr[c[1]] &&
                    boardArr[c[1]] == boardArr[c[2]]) {
                return true;
            }
        }

        return false;
    }

    public static boolean draw(Board board) {
        return  board.isFull() && !win(board);
    }
}
