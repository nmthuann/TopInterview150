package Arrays;

import java.util.HashMap;

/**
 * @author LENOVO
 * @project Top150Interview
 * @date 7/25/2024
 */
public class MajorityElementSolution {
    public int majorityElement(int[] nums) {
//        HashMap<Integer, Integer> hashMap = new HashMap<>();
//        for (int num : nums) {
//            hashMap.put(num, hashMap.getOrDefault(num, 0) + 1);
//        }
//        for (int key : hashMap.keySet()) {
//            if (hashMap.get(key) > nums.length / 2) {
//                return key;
//            }
//        }
//        return -1;
       int vote = 0;
       int candidate = -1;
       for (int i = 0; i < nums.length; i++){
           if (vote == 0){
               candidate = nums[i];
               vote = 1;
           }
           else {
               if(nums[i] == candidate){
                   vote ++;
               }
               else {
                   vote--;
               }
           }
       }
        vote = 0;
       for(int i = 0; i< nums.length; i++){
           if(candidate == nums[i]){
               vote++;
           }
       }
        if (vote > (nums.length / 2))
            return candidate;
        return -1;
    }
}


//    int count = 0, candidate = -1;
//
//// Finding majority candidate
//        for (int index = 0; index < nums.length; index++) {
//        if (count == 0) {
//        candidate = nums[index];
//        count = 1;
//        }
//        else {
//        if (nums[index] == candidate)
//        count++;
//        else
//        count--;
//        }
//        }
//
//        // Checking if majority candidate occurs more than
//        // n/2 times
//        count = 0;
//        for (int index = 0; index < nums.length; index++) {
//        if (nums[index] == candidate)
//        count++;
//        }
//        if (count > (nums.length / 2))
//        return candidate;
//        return -1;
