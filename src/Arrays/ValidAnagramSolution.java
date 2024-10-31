package Arrays;

/**
 * @author LENOVO
 * @project TopInterview150
 * @date 10/31/2024
 */
public class ValidAnagramSolution {
     public boolean isAnagramTheFirstWay(String s, String t) {
         if(s.length() != t.length()) return false;
         int [] count = new int[26];
         for (int i = 0; i < s.length(); i++) {
             count [s.charAt(i) - 'a']++;
             count [t.charAt(i) - 'a']--;
         }

         for (int c: count) {
             if(c!=0) return false;
         }
         return true;
     }

    public boolean isAnagramTheSecondWay(String s, String t) {
        int[] setIndexS = setIndex(s);
        int[] setIndexT = setIndex(t);
        for(int i = 0; i < setIndexS.length; i++){
            if(setIndexS[i] != setIndexT[i]) return false;
        }
        return true;
    }

    public int [] setIndex (String str){
        int [] count = new int[26];
        for(int i = 0; i < str.length(); i++){
            int index = str.charAt(i) - 'a';
            count[index]++;
        }
        return count;
    }

    public boolean isAnagramTheThirdWay(String s, String t) {
         if (s.length() != t.length()) {
             return false;
         }

         int xor = 0;
         int sumS = 0;
         int sumT = 0;

         for (int i = 0; i < s.length(); i++) {
             xor ^= s.charAt(i) ^ t.charAt(i);
             sumS += s.charAt(i);
             sumT += t.charAt(i);
         }

         return xor == 0 && sumS == sumT;
     }
}
