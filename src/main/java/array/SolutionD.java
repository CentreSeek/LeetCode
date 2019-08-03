package array;

/**
 * 给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。
 * <p>
 * 最高位数字存放在数组的首位， 数组中每个元素只存储一个数字。
 * <p>
 * 你可以假设除了整数 0 之外，这个整数不会以零开头。
 */
class SolutionD {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; ) {
            digits[i] += 1;
            if (digits[i] == 10 && i != 0) {
                digits[i] = 0;
                i--;
            } else if (digits[i] == 10 && i == 0) {
                int[] arr = new int[digits.length + 1];
                arr[0] = 1;
                arr[1] = 0;
                for (int j = 2; j < arr.length; j++) {
                    arr[j] = digits[j - 1];
                }
                return arr;
            } else {
                break;
            }
        }
        return digits;
    }
}