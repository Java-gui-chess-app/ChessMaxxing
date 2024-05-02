import javax.swing.JOptionPane;
public class Chess {
    public static void main(String[] args) throws Exception {
        {
        String[] options = {"Play", "Options", "Exit"};
            int mainMenuOption = JOptionPane.showOptionDialog(null, "welcome to Chess", "Chessmaxxing", 0, 3, null, options, options[0]);
            if(mainMenuOption == 0);
                Character[][] board = {{'♜','♞','♝','♚','♛','♞','♝','♜'}, {'♟', '♟', '♟','♟','♟','♟','♟','♟',}, {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' }, {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' }, {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' }, {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' }, {'♙', '♙', '♙', '♙', '♙', '♙', '♙', '♙'}, {'♖', '♘', '♗', '♕', '♔', '♗', '♘', '♖' }};
                String boardDisplay = PrintBoard.main(board);
                String move = JOptionPane.showInputDialog(null, boardDisplay, "board", 1);
                board = Engine.main(move, board);
        };
    }
}
