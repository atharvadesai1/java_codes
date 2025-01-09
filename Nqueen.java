import java.util.Scanner;

public class Nqueen {
    // Function to print the board
    private static void printBoard(int[][] board, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(board[i][j] == 1){
                    System.out.print("Q ");
                }
                else{
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    // Function to check if placing a queen is safe
    private static boolean isSafe(int[][] board, int row, int col, int n) {
        // Check this column on the upper side
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 1) return false;
        }

        // Check the upper left diagonal
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1) return false;
        }

        // Check the upper right diagonal
        for (int i = row, j = col; i >= 0 && j < n; i--, j++) {
            if (board[i][j] == 1) return false;
        }

        return true;
    }

    // Recursive function to solve the N-Queens problem
    private static boolean solveNQueens(int[][] board, int row, int n) {
        // Base case: If all queens are placed
        if (row >= n) {
            printBoard(board, n); // Print the solution
            return true;
        }

        boolean foundSolution = false;

        // Try placing a queen in all columns of the current row
        for (int col = 0; col < n; col++) {
            if (isSafe(board, row, col, n)) {
                // Place the queen
                board[row][col] = 1;

                // Recur to place the rest of the queens
                foundSolution = solveNQueens(board, row + 1, n) || foundSolution;

                // Backtrack: Remove the queen
                board[row][col] = 0;
            }
        }

        return foundSolution;
    }

    // Main function to initiate solving the N-Queens problem
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of board: ");
        int n = sc.nextInt(); // Change this value for different board sizes
        int[][] board = new int[n][n];

        if (!solveNQueens(board, 0, n)) {
            System.out.println("No solution exists for " + n + "-Queens.");
        } else {
            System.out.println("Solutions found for " + n + "-Queens.");
        }
    }
}
