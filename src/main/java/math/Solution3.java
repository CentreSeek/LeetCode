package math;

/**
 * @program: LeetCode
 * @description: 给定一个整数，写一个函数来判断它是否是 3 的幂次方。
 * @author: CentreS
 * @create: 2020-01-17 10:54:19
 **/
public class Solution3 {
    public boolean isPowerOfThree(int n) {
        if (n == 0) {
            return false;
        } else if (n == 1) {
            return true;
        }
        if (n % 3 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
