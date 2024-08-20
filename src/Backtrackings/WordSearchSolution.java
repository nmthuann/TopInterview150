package Backtrackings;

/**
 * @author LENOVO
 * @project TopInterview150
 * @date 8/20/2024
 */
public class WordSearchSolution {
    public boolean exist(char[][] board, String word) {
        if (
                board == null ||
                        board.length == 0 ||
                        word == null ||
                        word.length() == 0
        ) {
            return false;
        }

        int rows = board.length;
        int cols = board[0].length;

        // Initialize visited array
        boolean[][] visited = new boolean[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (dfs(board, word, i, j, 0, visited)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean dfs(char[][] board, String word, int i, int j, int index, boolean[][] visited) {
        // Check if index is out of bounds or character does not match or cell is visited
        if (index == word.length()) {
            return true;
        }
        if (
                i < 0 ||
                j < 0 ||
                i >= board.length ||
                j >= board[0].length ||
                visited[i][j] ||
                board[i][j] != word.charAt(index)
        ) {
            return false;
        }

        // Mark the cell as visited
        visited[i][j] = true;

        // Explore all possible directions
        boolean found =
                dfs(board, word, i + 1, j, index + 1, visited) ||
                dfs(board, word, i - 1, j, index + 1, visited) ||
                dfs(board, word, i, j + 1, index + 1, visited) ||
                dfs(board, word, i, j - 1, index + 1, visited);

        // Unmark the cell as visited for other paths
        visited[i][j] = false;

        return found;
    }
}
