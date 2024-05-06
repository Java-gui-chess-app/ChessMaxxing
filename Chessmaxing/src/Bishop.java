import javax.swing.JOptionPane;
public class Bishop extends Chess {
    public static Character[][] main(int[] move2, Character[][] board, boolean isWhite) {
        {
        //assigns variable for the direction the bishop is moving(0 = up right, 1 = down right, 2 = down left, 3 = up left)
        int direction;
        if ((move2[0]-move2[2]) > 0 && (move2[1]-move2[3]) > 0) direction = 3;
        else if ((move2[0]-move2[2]) < 0 && (move2[1]-move2[3]) > 0) direction = 2;
        else if ((move2[0]-move2[2]) < 0 && (move2[1]-move2[3]) < 0) direction = 1;
        else if ((move2[0]-move2[2]) > 0 && (move2[1]-move2[3]) < 0) direction = 0;
        else {JOptionPane.showMessageDialog(null, "That peice can not move to that square", "Oops!", 0); return board;};
        //checks if peice being moved is correct colour
        if ((isWhite == false && board[move2[0]][move2[1]] == '♝' || isWhite == true && board[move2[0]][move2[1]] == '♗' ) == false) {JOptionPane.showMessageDialog(null, "That is not your peice.", "Oops!", 0); return board;}
        //checks if move is legal for Bishops
        if (Math.abs(move2[0]-move2[2]) == Math.abs(move2[1]-move2[3]));
        else {JOptionPane.showMessageDialog(null, "That peice can not move to that square", "Oops!", 0); return board;};
        //checks if any peices are in the way
        switch (direction) {
            case 0:
                for (int i = 1; i < Math.abs(move2[0] - move2[2]); i++)
            if (board[move2[0]-i][move2[1]+i] != ' ') {JOptionPane.showMessageDialog(null, "Something is in the way.", "Oops!", 0); return board;}
                break;
            case 1:
            for (int i = 1; i < Math.abs(move2[0] - move2[2]); i++)
            if (board[move2[0]+i][move2[1]+i] != ' ') {JOptionPane.showMessageDialog(null, "Something is in the way.", "Oops!", 0);  return board;}
                break;
            case 2:
            for (int i = 1; i < Math.abs(move2[0] - move2[2]); i++)
            if (board[move2[0]+i][move2[1]-i] != ' ') {JOptionPane.showMessageDialog(null, "Something is in the way.", "Oops!", 0); return board;} 
                break;
            case 3:
            for (int i = 1; i < Math.abs(move2[0] - move2[2]); i++)
            if (board[move2[0]-i][move2[1]-i] != ' ') {JOptionPane.showMessageDialog(null, "Something is in the way.", "Oops!", 0);  return board;}
                break;
        }
        //checks if landing square is valid
        if (isWhite == false)
            {if (board[move2[2]][move2[3]] == '♜' || board[move2[2]][move2[3]] == '♞' || board[move2[2]][move2[3]] == '♝' || board[move2[2]][move2[3]] == '♚' || board[move2[2]][move2[3]] == '♛' || board[move2[2]][move2[3]] == '♟') {JOptionPane.showMessageDialog(null, "You can't capture your own peice.", "Oops!", 0); return board;}}
        else if (isWhite == true)
            {if (board[move2[2]][move2[3]] == '♖' || board[move2[2]][move2[3]] == '♘' || board[move2[2]][move2[3]] == '♗' || board[move2[2]][move2[3]] == '♔' || board[move2[2]][move2[3]] == '♕' || board[move2[2]][move2[3]] == '♙') {JOptionPane.showMessageDialog(null, "You can't capture your own peice.", "Oops!", 0); return board;}}
        
        //changes board based on move
        board[move2[0]][move2[1]] = ' ';
        if (isWhite == true) board[move2[2]][move2[3]] = '♗';
        else board[move2[2]][move2[3]] = '♝';
        return board;
        }
    }
} 