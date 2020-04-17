package math;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @program: LeetCode
 * @description: 写一个程序，输出从 1 到 n 数字的字符串表示。  1. 如果 n 是3的倍数，输出“Fizz”；  2. 如果 n 是5的倍数，输出“Buzz”；  3.如果 n 同时是3和5的倍数，输出 “FizzBuzz”。
 * @author: CentreS
 * @create: 2020-01-17 09:30:37
 **/
public class Solution1 {

    public List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<String>();
        for (int i = 1; i < n + 1; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                list.add("FizzBuzz");
            } else if (i % 3 == 0) {
                list.add("Fizz");
            } else if (i % 5 == 0) {
                list.add("Buzz");
            } else {
                list.add(String.valueOf(i));
            }
        }
        return list;
    }

    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
        System.out.println(solution1.fizzBuzz(10).toString());;
    }

}
