import javax.swing.JOptionPane;
public class Engine extends Chess {
    public static Character[][] main(String move, Character[][] board, int turnNumber) {
        {
        boolean isWhite;
        //converts move input into a int array
        String move1[] = move.split(" ", 4);
        int move2[] = {Integer.parseInt(move1[0])-1, Integer.parseInt(move1[1])-1, Integer.parseInt(move1[2])-1, Integer.parseInt(move1[3])-1};
        //checks who's turn it is
        if (turnNumber % 2 == 0) isWhite = true;
        else isWhite = false;
        //checks the peice being moved and calls on that peice's function or method or whatever
        switch(board[move2[0]][move2[1]]){
            /*case '♔':
            case '♚':
                board = Piece.King(move2, board, isWhite);
                break;*/
            case '♕':
            case '♛':
                board = Piece.Queen(move2, board, isWhite);
                break;
            case '♖':
            case '♜':
                board = Piece.Rook(move2, board, isWhite);
                break;
            case '♗':
            case '♝':
                board = Piece.Bishop(move2, board, isWhite);
                break;
            case '♘':
            case '♞':
                board = Piece.Knight(move2, board, isWhite);
                break;
            case '♙':
            case '♟':
                board = Piece.Pawn(move2, board, isWhite);
                break;
            default:
            JOptionPane.showMessageDialog(null, "the peice you attempted to move is not a valid peice", "Oops!", 0);
        }
        return board;
        }
    }
}
