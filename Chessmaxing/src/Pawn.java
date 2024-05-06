import javax.swing.JOptionPane;
public class Pawn extends Chess {
    public static Character[][] main(int[] move2, Character[][] board, boolean isWhite) {
        {
        //checks if peice being moved is correct colour
        if (((isWhite == false && board[move2[0]][move2[1]] == '♟') || (isWhite == true && board[move2[0]][move2[1]] == '♙')) == false) {JOptionPane.showMessageDialog(null, "That is not your peice.", "Oops!", 0); return board;};
        //checks if pawn can move to landing space
        if (isWhite == true){
            if ((move2[0] - move2[2] == 1 && move2[1] == move2[3]) && board[move2[2]][move2[3]] == ' ');
            else if (((move2[0]-move2[2] == 2 && move2[0] == 6) && move2[1] == move2[3]) && (board[move2[2]+1][move2[3]] == ' ' && board[move2[2]][move2[3]] == ' '));
            else if ((move2[0] - move2[2] == 1 && Math.abs(move2[1] - move2[3]) == 1) && (board[move2[2]][move2[3]] == '♜' || board[move2[2]][move2[3]] == '♞' || board[move2[2]][move2[3]] == '♝' || board[move2[2]][move2[3]] == '♚' || board[move2[2]][move2[3]] == '♛' || board[move2[2]][move2[3]] == '♟'));
            else {JOptionPane.showMessageDialog(null, "That peice can not move to that square", "Oops!", 0); return board;};
            }
        else {
            if ((move2[0] - move2[2] == -1 && move2[1] == move2[3]) && board[move2[2]][move2[3]] == ' ');
            else if (((move2[0]-move2[2] == -2 && move2[0] == 1) && move2[1] == move2[3]) && (board[move2[2]-1][move2[3]] == ' ' && board[move2[2]][move2[3]] == ' '));
            else if ((move2[0] - move2[2] == -1 && Math.abs(move2[1] - move2[3]) == 1) && board[move2[2]][move2[3]] == '♖' || board[move2[2]][move2[3]] == '♘' || board[move2[2]][move2[3]] == '♗' || board[move2[2]][move2[3]] == '♔' || board[move2[2]][move2[3]] == '♕' || board[move2[2]][move2[3]] == '♙');
            else {JOptionPane.showMessageDialog(null, "That peice can not move to that square", "Oops!", 0); return board;};
            };
        //checks if landing square is valid
        if (isWhite == false)
            {if (board[move2[2]][move2[3]] == '♜' || board[move2[2]][move2[3]] == '♞' || board[move2[2]][move2[3]] == '♝' || board[move2[2]][move2[3]] == '♚' || board[move2[2]][move2[3]] == '♛' || board[move2[2]][move2[3]] == '♟') {JOptionPane.showMessageDialog(null, "You can't capture your own peice.", "Oops!", 0); return board;}}
        else if (isWhite == true)
            {if (board[move2[2]][move2[3]] == '♖' || board[move2[2]][move2[3]] == '♘' || board[move2[2]][move2[3]] == '♗' || board[move2[2]][move2[3]] == '♔' || board[move2[2]][move2[3]] == '♕' || board[move2[2]][move2[3]] == '♙') {JOptionPane.showMessageDialog(null, "You can't capture your own peice.", "Oops!", 0); return board;}}
        
        //changes board based on move
        board[move2[0]][move2[1]] = ' ';
        if (isWhite == true) board[move2[2]][move2[3]] = '♙';
        else board[move2[2]][move2[3]] = '♟';
        return board;
        }
    }
}