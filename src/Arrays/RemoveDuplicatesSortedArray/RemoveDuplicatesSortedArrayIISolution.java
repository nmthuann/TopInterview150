package Arrays.RemoveDuplicatesSortedArray;

/**
 * @author LENOVO
 * @project Top150Interview
 * @date 7/25/2024
 */
public class RemoveDuplicatesSortedArrayIISolution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int k = 1;  // Pointer for the position to insert the next valid element
        int count = 1;  // Counter for occurrences of the current element

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                count++;
            } else {
                count = 1;  // Reset count for a new element
            }

            if (count <= 2) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }
}
