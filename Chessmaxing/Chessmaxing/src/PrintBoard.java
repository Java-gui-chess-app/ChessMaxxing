public class PrintBoard extends Chess {
    public static String main(Character[][] board) {
        
        {
            String boardDisplay = "";
            
            for (int row = 0; row <= 7; row++)
            {
                for (int col = 0; col <= 7; col++)
                {
                    boardDisplay += board[row][col];
                };
                boardDisplay += '\n';
            };
            return boardDisplay;
        
        }
    }
}
