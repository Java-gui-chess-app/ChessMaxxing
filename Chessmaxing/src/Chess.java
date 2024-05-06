import javax.swing.JOptionPane;
public class Chess {
    public static void main(String[] args) throws Exception {
        {
        String[] options = {"Play", "Options", "Exit"};
        boolean gameOver = false;
        String oldBoard;
        String boardDisplay = "default";
            int mainMenuOption = JOptionPane.showOptionDialog(null, "Welcome to Chess!", "Chessmaxxing", 0, 3, null, options, options[0]);
            if(mainMenuOption == 0);
                Character[][] board = {{'♜','♞','♝','♚','♛','♞','♝','♜'}, {'♟', '♟', '♟','♟','♟','♟','♟','♟',}, {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' }, {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' }, {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' }, {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' }, {'♙', '♙', '♙', '♙', '♙', '♙', '♙', '♙'}, {'♖', '♘', '♗', '♕', '♔', '♗', '♘', '♖' }};
                int turnNumber = -1;
            while (gameOver == false)
                {
                oldBoard = boardDisplay;
                boardDisplay = PrintBoard.main(board);
                if (oldBoard.equals(boardDisplay) == false) turnNumber++;
                String move = JOptionPane.showInputDialog(null, boardDisplay, "board", 1);
                board = Engine.main(move, board, turnNumber);
                }
        };
    }
}
