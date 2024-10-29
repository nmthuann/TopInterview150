package Tries.Tests;

import Tries.WordSearchIISolution;

import java.util.List;

/**
 * @author LENOVO
 * @project TopInterview150
 * @date 10/29/2024
 */
public class WordSearchIISolutionTest {
    public static void testFindWords() {
        WordSearchIISolution solution = new WordSearchIISolution();

        char[][] board = {
                {'o', 'a', 'a', 'n'},
                {'e', 't', 'a', 'e'},
                {'i', 'h', 'k', 'r'},
                {'i', 'f', 'l', 'v'}
        };

        String[] words = {"oath", "pea", "eat", "rain"};

        List<String> result = solution.findWords(board, words);
        System.out.println("Words found: " + result); // Expected output: ["oath", "eat"]
    }
}
