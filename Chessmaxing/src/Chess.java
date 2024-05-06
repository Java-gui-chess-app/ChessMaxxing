import javax.swing.JOptionPane;
public class Chess {
    public static void main(String[] args) throws Exception {
        {
        String[] options = {"Play", "Options", "Exit"};
        boolean gameOver = false;
            int mainMenuOption = JOptionPane.showOptionDialog(null, "Welcome to Chess!", "Chessmaxxing", 0, 3, null, options, options[0]);
            if(mainMenuOption == 0);
                Character[][] board = {{'♜','♞','♝','♚','♛','♞','♝','♜'}, {'♟', '♟', '♟','♟','♟','♟','♟','♟',}, {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' }, {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' }, {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' }, {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' }, {'♙', '♙', '♙', '♙', '♙', '♙', '♙', '♙'}, {'♖', '♘', '♗', '♕', '♔', '♗', '♘', '♖' }};
                int turnNumber = 0;
            while (gameOver == false)
                {String boardDisplay = PrintBoard.main(board);
                String move = JOptionPane.showInputDialog(null, boardDisplay, "board", 1);
                board = Engine.main(move, board, turnNumber);
                }
        };
    }
}
