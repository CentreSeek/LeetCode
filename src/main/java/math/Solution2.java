package math;

/**
 * @program: LeetCode
 * @description: 统计所有小于非负整数 n 的质数的数量。
 * @author: CentreS
 * @create: 2020-02-17 16:48:45
 **/
public class Solution2 {

    public int count = 0;

    public int countPrimes(int n) {
        if (n == 0 || n == 1) {
            return count;
        } else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {

                }
            }

        }
        return 0;
    }

}
