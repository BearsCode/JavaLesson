package HW_5.Task3;
public class Main {

    private static char[][] board = new char[8][8];

    public static void main(String[] args) {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                board[i][j] = '0';
            }
        }
        placeQueens(0);
    }

    private static void printBoard() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static boolean isSafe(int row, int col) {
       
        for (int i = 0; i < 8; i++) {
            if (board[i][col] == 'x') {
                return false;
            }
        }

        for (int j = 0; j < 8; j++) {
            if (board[row][j] == 'x') {
                return false;
            }
        }

        int i = row;
        int j = col;
        while (i >= 0 && j >= 0) {
            if (board[i][j] == 'x') {
                return false;
            }
            i--;
            j--;
        }

        i = row;
        j = col;
        while (i >= 0 && j < 8) {
            if (board[i][j] == 'x') {
                return false;
            }
            i--;
            j++;
        }
        return true;
    }

    private static void placeQueens(int row) {
        if (row == 8) {
            printBoard();

        } else {

            for (int col = 0; col < 8; col++) {
                if (isSafe(row, col)) {
                    board[row][col] = 'x';
                    placeQueens(row + 1);
                    board[row][col] = '0';
                }
            }
        }
    }
}
