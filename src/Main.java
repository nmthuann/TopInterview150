import Backtrackings.WordSearchSolution;
import BinaryTrees.impl.BinaryTree;
import BinaryTrees.impl.TreeNode;
import SlidingWindows.LongestSubstringWithoutRepeatingCharactersSolution;

/**
 * @author ${USER}
 * @project ${PROJECT_NAME}
 * @date ${DATE}
 */
public class Main {
    public static void main(String[] args) {
        // Example test case for exist method
//        char[][] board = {
//                {'A', 'B', 'C', 'E'},
//                {'S', 'F', 'C', 'S'},
//                {'A', 'D', 'E', 'E'}
//        };
//        String word = "ABCCED";

                char[][] board = {
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}
        };
        String word = "SEE";


        WordSearchSolution  solution = new WordSearchSolution ();
        if (solution.exist(board, word)) {
            System.out.println("found!");
        } else {
            System.out.println("not found!");
        }
    }
}


//    // Tạo cây nhị phân
//    BinaryTree binaryTree = new BinaryTree();
//    TreeNode root = null;
//
//// Chèn các giá trị vào cây BST
//        root = binaryTree.insert(root, 5);
//                root = binaryTree.insert(root, 3);
//                root = binaryTree.insert(root, 7);
//                root = binaryTree.insert(root, 2);
//                root = binaryTree.insert(root, 4);
//                root = binaryTree.insert(root, 6);
//                root = binaryTree.insert(root, 8);
//                binaryTree.InOrderTraversalLNR(root);
//
//                TreeNode root2 = root;
//                binaryTree.PreOrderTraversalNLR(root2);




//    Arrays.BestTimeToBuyAndSellStockSolution solution = new Arrays.BestTimeToBuyAndSellStockSolution();
//    int[] prices = {7,1,5,3,6,4};
//    int maxProfit = solution.maxProfit(prices);
//        System.out.println("Arrays.MajorityElementSolution: " + maxProfit);



//        Arrays.MajorityElementSolution solution = new Arrays.MajorityElementSolution();
//        int[] nums = {2,1,2,4,2,3,2};
//        int candidate = solution.majorityElement(nums);
//    Arrays.MergeSortedArraySolution solution = new Arrays.MergeSortedArraySolution();
//
//    int[] nums1 = {0,0,3,0,0,0,0,0,0};
//    int m = 3;
//    int[] nums2 = {-1,1,1,1,2,3};
//    int n = 6;
//
//        solution.merge(nums1, m, nums2, n);
//
//                // Print the result
//                for (int num : nums1) {
//                System.out.print(num + " ");
//                }



//    Arrays.RemoveDuplicatesSortedArrayIISolution solution = new Arrays.RemoveDuplicatesSortedArrayIISolution();
//    //        int [] nums = {1,1,1,1,2,2,3};
//    int [] nums = {1,1,1,1,2,2,3,3};
//    int k = solution.removeDuplicates(nums);
//        for (int num : nums) {
//                System.out.print(num + " ");
//                }
//                System.out.println("Arrays.RemoveElementSolution: " + k);



//    Arrays.RemoveDuplicatesSortedArraySolution solution = new Arrays.RemoveDuplicatesSortedArraySolution();
//    int [] nums = {1,1,2};
//    int k = solution.removeDuplicates(nums);
//        for (int num : nums) {
//                System.out.print(num + " ");
//                }
//                System.out.println("Arrays.RemoveElementSolution: " + k);


//    Arrays.MergeSortedArraySolution solution = new Arrays.MergeSortedArraySolution();
//
//    int[] nums1 = {0,0,3,0,0,0,0,0,0};
//    int m = 3;
//    int[] nums2 = {-1,1,1,1,2,3};
//    int n = 6;
//
//        solution.merge(nums1, m, nums2, n);
//
//                // Print the result
//                for (int num : nums1) {
//                System.out.print(num + " ");
//                }


//    Arrays.RemoveElementSolution solution = new Arrays.RemoveElementSolution();
//    int [] nums = {0,1,2,2,3,0,4,2};
//    int val = 2;
//    int k = solution.removeElement(nums, val);
//        for (int num : nums) {
//                System.out.print(num + " ");
//                }
//                System.out.println("Arrays.RemoveElementSolution: " + k);


//    LongestSubstringWithoutRepeatingCharactersSolution solution =
//            new LongestSubstringWithoutRepeatingCharactersSolution();
//    int maxLength = solution.lengthOfLongestSubstring("abcabcbb");
//        System.out.println("SlidingWindow.LongestSubstringWithoutRepeatingCharactersSolution: " + maxLength);