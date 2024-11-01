package Arrays;

/**
 * @author LENOVO
 * @project TopInterview150
 * @date 11/1/2024
 */
public class RomanToIntegerSolution {
    public int romanToInt(String s) {
        // symbol = (index % 2 == 0) -> 1 * 10 ^ (index/2)
        // symbol = (index % 2 != 0) -> 5 * 10 ^ ((index - 1)/2)
        // LVIII= 50 + 5 + 1 + 1 + 1
        // MCMXCIV = 1000 + (-100+1000)

        char[] symbolArray = {'I', 'V', 'X', 'L', 'C', 'D', 'M'};
        int dec = 0;
        int count = 0;

        // lặp giống nhau: tối đa 3 lần
        // không lặp
        // từ có index đơn vị 1 ở trước từ có index 5
        // đúng thứ tự
        for(int i = 0; i < s.length()-1; i++){
            // III
            if(s.charAt(i) == s.charAt(i+1)){
                int j = 0;
                while(j < 3){
                    if(s.charAt(i) != s.charAt(j + i)){
                        break;
                    }
                    count++;
                    j=j+1;
                }
                dec = dec + count*calculateSymbol(findIndex(symbolArray, s.charAt(i)));
                i = j + i - 1;
                count = 0;
            }
            // không lặp
            else {
                // "DCXXI" 621
                if(
                        (findIndex(symbolArray, s.charAt(i)) > findIndex(symbolArray, s.charAt(i+1)))

                ) {
                    dec = dec + calculateSymbol(findIndex(symbolArray, s.charAt(i)));
                }
                else {
                    dec = dec + (
                            calculateSymbol(findIndex(symbolArray, s.charAt(i+1)))
                                    -
                                    calculateSymbol(findIndex(symbolArray, s.charAt(i)))
                    );
                    i = i + 1;
                }
            }


        }

        return dec;
    }

    public int romanToIntFix(String s) {
        char[] symbolArray = {'I', 'V', 'X', 'L', 'C', 'D', 'M'};
        int dec = 0;

        for (int i = 0; i < s.length(); i++) {
            int currentIndex = findIndex(symbolArray, s.charAt(i));
            int nextIndex = (i + 1 < s.length()) ? findIndex(symbolArray, s.charAt(i + 1)) : -1;

            // Nếu ký tự tiếp theo lớn hơn ký tự hiện tại, trừ đi giá trị của ký tự hiện tại
            if (nextIndex > currentIndex) {
                dec = Math.subtractExact(dec, calculateSymbol(currentIndex));
            } else {
                // Ngược lại, cộng giá trị của ký tự hiện tại
                dec = Math.addExact(dec, calculateSymbol(currentIndex));
            }
        }

        return dec;
    }
    public static int findIndex(char[] array, char key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static int calculateSymbol(int index) {
        if (index % 2 == 0) {
            // index chẵn
            return (int) (1 * Math.pow(10, index / 2));
        } else {
            // index lẻ
            return (int) (5 * Math.pow(10, (index - 1) / 2));
        }
    }
}
