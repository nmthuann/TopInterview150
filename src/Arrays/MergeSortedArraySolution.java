package Arrays;

/**
 * @author LENOVO
 * @project Top150Interview
 * @date 7/22/2024
 */
public class MergeSortedArraySolution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int last = m + n - 1; // Correctly set the last index

        // While there are elements in both nums1 and nums2
        while (m > 0 && n > 0) {
            if (nums1[m - 1] > nums2[n - 1]) {
                nums1[last] = nums1[m - 1];
                m--;
            } else {
                nums1[last] = nums2[n - 1];
                n--;
            }
            last--;
        }

        // Fill nums1 with leftover nums2 elements if there are any
        while (n > 0) {
            nums1[last] = nums2[n - 1];
            n--;
            last--;
        }
    }
}
