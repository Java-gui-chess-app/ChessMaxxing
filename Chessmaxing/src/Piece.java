import javax.swing.JOptionPane;

public class Piece {

    public static Character[][] Pawn(int[] move2, Character[][] board, boolean isWhite) {
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

    public static Character[][] Knight(int[] move2, Character[][] board, boolean isWhite) {
        {
        //checks if peice being moved is correct colour
        if ((isWhite == false && board[move2[0]][move2[1]] == '♞' || isWhite == true && board[move2[0]][move2[1]] == '♘' ) == false) {JOptionPane.showMessageDialog(null, "That is not your peice.", "Oops!", 0); return board;}
        //checks if move is legal for knights
        if((Math.abs(move2[0]-move2[2]) == 2 && Math.abs(move2[1]-move2[3]) == 1) || (Math.abs(move2[0]-move2[2]) == 1 && Math.abs(move2[1]-move2[3]) == 2));
        else {JOptionPane.showMessageDialog(null, "That peice can not move to that square", "Oops!", 0); return board;};
        //checks if landing square is valid
        if (isWhite == false)
            {if (board[move2[2]][move2[3]] == '♜' || board[move2[2]][move2[3]] == '♞' || board[move2[2]][move2[3]] == '♝' || board[move2[2]][move2[3]] == '♚' || board[move2[2]][move2[3]] == '♛' || board[move2[2]][move2[3]] == '♟') {JOptionPane.showMessageDialog(null, "You can't capture your own peice.", "Oops!", 0); return board;}}
        else if (isWhite == true)
            {if (board[move2[2]][move2[3]] == '♖' || board[move2[2]][move2[3]] == '♘' || board[move2[2]][move2[3]] == '♗' || board[move2[2]][move2[3]] == '♔' || board[move2[2]][move2[3]] == '♕' || board[move2[2]][move2[3]] == '♙') {JOptionPane.showMessageDialog(null, "You can't capture your own peice.", "Oops!", 0); return board;}}
        
        //changes board based on move
        board[move2[0]][move2[1]] = ' ';
        if (isWhite == true) board[move2[2]][move2[3]] = '♘';
        else board[move2[2]][move2[3]] = '♞';
        return board;
        }
    }

    public static Character[][] Rook(int[] move2, Character[][] board, boolean isWhite) {
        {
        //checks for direction of move (0=right,1=down,2=left,3=up)
        int direction = 0;
            if (move2[0] == move2[2])
                {if (move2[1] == move2[3])return board;
                else if (move2[1] > move2[3]) direction = 3;
                else if (move2[1] < move2[3]) direction = 1;}
            else if (move2[1] == move2[3])
                {if (move2[0] == move2[2])return board;
                else if (move2[0] > move2[2]) direction = 2;
                else if (move2[0] < move2[2]) direction = 0;}
            else {JOptionPane.showMessageDialog(null, "That peice can not move to that square", "Oops!", 0); return board;};
        //checks if peice being moved is correct colour
        if ((isWhite == false && board[move2[0]][move2[1]] == '♜' || isWhite == true && board[move2[0]][move2[1]] == '♖' ) == false) {JOptionPane.showMessageDialog(null, "That is not your peice.", "Oops!", 0); return board;}
        //checks if other peices are in the way
        switch (direction) {
            case 0:
                for (int i = move2[0]+1; i < move2[2]; i++)
                    if (board[i][move2[1]] != ' ') {JOptionPane.showMessageDialog(null, "Something is in the way.", "Oops!", 0); return board;}
                break;
            case 1:
                for (int i = move2[1]+1; i < move2[3]; i++)
                    if (board[move2[0]][i] != ' ') {JOptionPane.showMessageDialog(null, "Something is in the way.", "Oops!", 0); return board;}
                break;
            case 2:
                for (int i = move2[0]-1; i > move2[2]; i--)
                    if (board[i][move2[1]] != ' ') {JOptionPane.showMessageDialog(null, "Something is in the way.", "Oops!", 0); return board;}
                break;
            case 3:
                for (int i = move2[1]-1; i > move2[3]; i--)
                    if (board[move2[0]][i] != ' ') {JOptionPane.showMessageDialog(null, "Something is in the way.", "Oops!", 0); return board;}
                break;
        }
        //checks if landing square is valid
        if (isWhite == false)
            {if (board[move2[2]][move2[3]] == '♜' || board[move2[2]][move2[3]] == '♞' || board[move2[2]][move2[3]] == '♝' || board[move2[2]][move2[3]] == '♚' || board[move2[2]][move2[3]] == '♛' || board[move2[2]][move2[3]] == '♟') {JOptionPane.showMessageDialog(null, "You can't capture your own peice.", "Oops!", 0); return board;}}
        else if (isWhite == true)
            {if (board[move2[2]][move2[3]] == '♖' || board[move2[2]][move2[3]] == '♘' || board[move2[2]][move2[3]] == '♗' || board[move2[2]][move2[3]] == '♔' || board[move2[2]][move2[3]] == '♕' || board[move2[2]][move2[3]] == '♙') {JOptionPane.showMessageDialog(null, "You can't capture your own peice.", "Oops!", 0); return board;}}
        
        //changes board based on move
        board[move2[0]][move2[1]] = ' ';
        if (isWhite == true) board[move2[2]][move2[3]] = '♖';
        else board[move2[2]][move2[3]] = '♜';
        return board;
        }
    }

    public static Character[][] Bishop(int[] move2, Character[][] board, boolean isWhite) {
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

    public static Character[][] Queen(int[] move2, Character[][] board, boolean isWhite) {
        {
        //checks for direction of move (0=right,1=down,2=left,3=up,4 = up right, 5 = down right, 6 = down left, 7 = up left)
        int direction = 0;
            if (move2[0] == move2[2])
                {if (move2[1] == move2[3])return board;
                else if (move2[1] > move2[3]) direction = 3;
                else if (move2[1] < move2[3]) direction = 1;}
            else if (move2[1] == move2[3])
                {if (move2[0] == move2[2])return board;
                else if (move2[0] > move2[2]) direction = 2;
                else if (move2[0] < move2[2]) direction = 0;}
            else if ((move2[0]-move2[2]) > 0 && (move2[1]-move2[3]) > 0) direction = 7;
            else if ((move2[0]-move2[2]) < 0 && (move2[1]-move2[3]) > 0) direction = 6;
            else if ((move2[0]-move2[2]) < 0 && (move2[1]-move2[3]) < 0) direction = 5;
            else if ((move2[0]-move2[2]) > 0 && (move2[1]-move2[3]) < 0) direction = 4;
            else {JOptionPane.showMessageDialog(null, "That peice can not move to that square", "Oops!", 0); return board;};
        //checks if move is legal for queen
        if(direction > 3) 
        {if (Math.abs(move2[0]-move2[2]) == Math.abs(move2[1]-move2[3]));
            else {JOptionPane.showMessageDialog(null, "That peice can not move to that square", "Oops!", 0); return board;};}
        //checks if peice being moved is correct colour
        if ((isWhite == false && board[move2[0]][move2[1]] == '♛' || isWhite == true && board[move2[0]][move2[1]] == '♕' ) == false) {JOptionPane.showMessageDialog(null, "That is not your peice.", "Oops!", 0); return board;}
        //checks if other peices are in the way
        switch (direction) {
            case 0:
                for (int i = move2[0]+1; i < move2[2]; i++)
                    if (board[i][move2[1]] != ' ') {JOptionPane.showMessageDialog(null, "Something is in the way.", "Oops!", 0); return board;}
                break;
            case 1:
                for (int i = move2[1]+1; i < move2[3]; i++)
                    if (board[move2[0]][i] != ' ') {JOptionPane.showMessageDialog(null, "Something is in the way.", "Oops!", 0); return board;}
                break;
            case 2:
                for (int i = move2[0]-1; i > move2[2]; i--)
                    if (board[i][move2[1]] != ' ') {JOptionPane.showMessageDialog(null, "Something is in the way.", "Oops!", 0); return board;}
                break;
            case 3:
                for (int i = move2[1]-1; i > move2[3]; i--)
                    if (board[move2[0]][i] != ' ') {JOptionPane.showMessageDialog(null, "Something is in the way.", "Oops!", 0); return board;}
                break;
            case 4:
                for (int i = 1; i < Math.abs(move2[0] - move2[2]); i++)
            if (board[move2[0]-i][move2[1]+i] != ' ') {JOptionPane.showMessageDialog(null, "Something is in the way.", "Oops!", 0); return board;}
                break;
            case 5:
            for (int i = 1; i < Math.abs(move2[0] - move2[2]); i++)
            if (board[move2[0]+i][move2[1]+i] != ' ') {JOptionPane.showMessageDialog(null, "Something is in the way.", "Oops!", 0);  return board;}
                break;
            case 6:
            for (int i = 1; i < Math.abs(move2[0] - move2[2]); i++)
            if (board[move2[0]+i][move2[1]-i] != ' ') {JOptionPane.showMessageDialog(null, "Something is in the way.", "Oops!", 0); return board;} 
                break;
            case 7:
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
        if (isWhite == true) board[move2[2]][move2[3]] = '♕';
        else board[move2[2]][move2[3]] = '♛';
        return board;
        }
    }    


}

