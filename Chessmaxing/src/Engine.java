public class Engine extends Chess {
    public static Character[][] main(String move, Character[][] board) {
        {
        String move2[] = move.split("", 4);
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
        {board = Pawn.main(move2, board);};

        return board;
        }
    }
}
