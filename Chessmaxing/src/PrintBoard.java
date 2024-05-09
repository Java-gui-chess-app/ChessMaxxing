public class PrintBoard extends Chess {
    public static String main(Character[][] board) {
        
        {
            String boardDisplay = "    1   2   3   4   5   6   7   8\n";
            
            for (int row = 0; row <= 7; row++)
            {
                boardDisplay += row+1+" ";
                for (int col = 0; col <= 7; col++)
                {
                    boardDisplay += board[row][col] + " ";
                };
                boardDisplay += '\n';
            };
            return boardDisplay;
        
        }
    }
}
