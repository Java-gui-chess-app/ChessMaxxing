import javax.swing.JOptionPane;
public class Chess {
    public static void main(String[] args) throws Exception {
        {
        String[] options = {"Play", "Exit"};
        boolean whiteWins = false;
        boolean blackWins = false;
        String oldBoard;
        String boardDisplay = "default";
            int mainMenuOption = JOptionPane.showOptionDialog(null, "Welcome to Chess!", "Chessmaxxing", 0, 2, null, options, options[0]);
            if(mainMenuOption == 0)
                {Character[][] board = {{'♜','♞','♝','♛','♚','♝','♞','♜'}, {'♟', '♟', '♟','♟','♟','♟','♟','♟',}, {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' }, {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' }, {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' }, {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' }, {'♙', '♙', '♙', '♙', '♙', '♙', '♙', '♙'}, {'♖', '♘', '♗', '♕', '♔', '♗', '♘', '♖' }};
                int turnNumber = -1;
            while (whiteWins == false && blackWins == false)
                {
                oldBoard = boardDisplay;
                boardDisplay = PrintBoard.main(board);
                if (oldBoard.equals(boardDisplay) == false) turnNumber++;
                String move = JOptionPane.showInputDialog(null, boardDisplay, "board", 1);
                board = Engine.main(move, board, turnNumber);
                whiteWins = true;
                blackWins = true;
                for (int row = 0; row <= 7; row++)
                    {
                    for (int col = 0; col <= 7; col++)
                        {
                        if (board[row][col] == '♚') whiteWins = false;
                        else if (board[row][col] == '♔') blackWins = false;
                        };
                    };
                }
            if (whiteWins == true) JOptionPane.showMessageDialog(null, "White wins!");
            else if (blackWins == true) JOptionPane.showMessageDialog(null, "Black wins!");
            }
        };
    }
}
