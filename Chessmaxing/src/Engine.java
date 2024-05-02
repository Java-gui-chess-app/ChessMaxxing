import javax.swing.JOptionPane;
public class Engine extends Chess {
    public static Character[][] main(String move, Character[][] board, int turnNumber) {
        {
        String move2[] = move.split("", 4);
        if (turnNumber % 2 == 0) {boolean isWhite = true;}
        else {boolean isWhite = false;};

        if(board[Integer.parseInt(move2[0]) - 1][Integer.parseInt(move2[1])-1] == '♔' || board[Integer.parseInt(move2[0]) - 1][Integer.parseInt(move2[1])-1] == '♚')
        {board = King.main(move2, board);};
        else if(board[Integer.parseInt(move2[0]) - 1][Integer.parseInt(move2[1])-1] == '♕' || board[Integer.parseInt(move2[0]) - 1][Integer.parseInt(move2[1])-1] == '♛')
        {board = Queen.main(move2, board);};
        else if(board[Integer.parseInt(move2[0]) - 1][Integer.parseInt(move2[1])-1] == '♖' || board[Integer.parseInt(move2[0]) - 1][Integer.parseInt(move2[1])-1] == '♜')
        {board = Rook.main(move2, board);};
        else if(board[Integer.parseInt(move2[0]) - 1][Integer.parseInt(move2[1])-1] == '♗' || board[Integer.parseInt(move2[0]) - 1][Integer.parseInt(move2[1])-1] == '♝')
        {board = Bishop.main(move2, board);};
        else if(board[Integer.parseInt(move2[0]) - 1][Integer.parseInt(move2[1])-1] == '♘' || board[Integer.parseInt(move2[0]) - 1][Integer.parseInt(move2[1])-1] == '♞')
        {board = Knight.main(move2, board);};
        else if(board[Integer.parseInt(move2[0]) - 1][Integer.parseInt(move2[1])-1] == '♙' || board[Integer.parseInt(move2[0]) - 1][Integer.parseInt(move2[1])-1] == '♟')
        {board = Pawn.main(move2, board, isWhite);};
        else {JOptionPane.showMessageDialog(null, "the peice you attempted to move is not a valid peice", "Oops!", 0); };

        return board;
        }
    }
}
