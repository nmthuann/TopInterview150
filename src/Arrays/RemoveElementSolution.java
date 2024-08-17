package Arrays;

/**
 * @author LENOVO
 * @project Top150Interview
 * @date 7/23/2024
 */
public class RemoveElementSolution {
    public int removeElement(int[] nums, int val) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }
}
