package Tries;

import java.util.*;

/**
 * @author LENOVO
 * @project TopInterview150
 * @date 8/21/2024
 */
public class WordSearchIISolution {

    static class TrieNode {
        char c;
        HashMap<Character, TrieNode> children = new HashMap<>();
        boolean isLeaf;

        public TrieNode() {}

        public TrieNode(char c) {
            this.c = c;
        }
    }

    static class Trie {
        private TrieNode root;

        public Trie() {
            root = new TrieNode();
        }

        public void insert(String word) {
            TrieNode node = root;
            for (char c : word.toCharArray()) {
                node.children.putIfAbsent(c, new TrieNode(c));
                node = node.children.get(c);
            }
            node.isLeaf = true; // Mark the end of the word
        }
    }



    public List<String> findWords(char[][] board, String[] words) {
        Trie trie = new Trie();
        for (String word : words) {
            trie.insert(word);
        }
        Set<String> result = new HashSet<>();
        int rows = board.length;
        int cols = board[0].length;
        boolean[][] visited = new boolean[rows][cols];


        for(int i = 0; i< rows; i++){
            for (int j = 0; j < cols; j++){
                char c = board[i][j];
                if (trie.root.children.containsKey(c)) {
                    dfs(board, trie.root.children.get(c), i, j, "" + c, visited, result);
                }
            }
        }
        return new ArrayList<>(result);
    }

    private void dfs(char[][] board, TrieNode node, int i, int j, String path, boolean[][] visited, Set<String> result) {
        if (node.isLeaf) {
            result.add(path); // path chứa từ hợp lệ
            node.isLeaf = false; // Đánh dấu để tránh thêm từ trùng lặp
        }

        // Đánh dấu ô hiện tại là đã thăm
        visited[i][j] = true;

        // Hướng di chuyển: lên, phải, xuống, trái
        int[] directions = {-1, 0, 1, 0, -1};

        for (int d = 0; d < 4; d++) {
            int nx = i + directions[d];
            int ny = j + directions[d + 1];
            if (nx >= 0 && nx < board.length && ny >= 0 && ny < board[0].length && !visited[nx][ny]) {
                char c = board[nx][ny];
                if (node.children.containsKey(c)) {
                    dfs(board, node.children.get(c), nx, ny, path + c, visited, result);
                }
            }
        }

        // Đánh dấu ô hiện tại là chưa thăm để cho các đệ quy tiếp theo có thể sử dụng
        visited[i][j] = false;
    }
}
