package core.pojo;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Board {

    private static final Logger logger = Logger.getLogger(Board.class.getName());
    private byte[][] gameBoard;
    private Player playerOne;
    private Player playerTwo;

    public Board() {
        startNewBoard();
    }

    public void setPlayers(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;

        if (playerTwo.isBot())
            logger.log(Level.INFO, "Player 2 set as bot");
    }

    public void startNewBoard() {
        this.gameBoard = new byte[][]{
                {-4, -2, -3, -5, -6, -3, -2, -4},
                {-1, -1, -1, -1, -1, -1, -1, -1},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {+1, +1, +1, +1, +1, +1, +1, +1},
                {+4, +2, +3, +5, +6, +3, +2, +4}
        };
        convertToPiece();
    }

    public boolean getNpcMove() {
        return false;
    }

    public byte[][] getGameBoard() {
        return gameBoard;
    }

    public void convertToPiece() {

    }

    public void updateBoard(byte[][] newBoard){
        gameBoard = newBoard;
    }
}