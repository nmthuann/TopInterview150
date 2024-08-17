package Arrays;

/**
 * @author LENOVO
 * @project Top150Interview
 * @date 7/24/2024
 */
public class RemoveDuplicatesSortedArraySolution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int k = 1;
        for(int i = 1; i < nums.length; i ++){
            if(nums[i] != nums[i-1]){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}
