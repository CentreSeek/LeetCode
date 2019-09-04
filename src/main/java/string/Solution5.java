/**
 * Copyright (C), 2019, 义金(杭州)健康科技有限公司
 * FileName: Solution5
 * Author:   CentreS
 * Date:     2019/7/11 16:29
 * Description: 给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package string;

import javax.sound.midi.Soundbank;
import java.util.Arrays;

/**
 * @author CentreS
 * @Description: 给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
 * @create 2019/7/11
 */
public class Solution5 {

    private static char[] arr = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z',
            '0','1','2','3','4','5','6','7','8','9'};

    public static boolean isPalindrome(String s) {
        char[] chars = s.toLowerCase().toCharArray();
        char[] tmpChars = new char[chars.length];
        int x = 0;
        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (chars[i] == arr[j]) {
                    tmpChars[x] = chars[i];
                    x++;
                }
            }
        }
        int j = tmpChars.length - 1;
        if (j <= 0) {
            return true;
        }
        for (int i = 0; i < tmpChars.length; i++, j--) {
            while (tmpChars[j] == '\u0000' && j > 0) {
                j--;
            }
            if (i == j || i > j) {
                return true;
            }
            if (tmpChars[i] != tmpChars[j]) {
                return false;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("0P"));
        ;
    }

}
