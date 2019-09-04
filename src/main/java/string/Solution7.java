/**
 * Copyright (C), 2019, 寻央大人留书
 * FileName: Solution7
 * Author:   CentreS
 * Date:     2019/9/4 14:28
 * Description: 实现 strStr() 函数。  给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。如果不存在，则返回  -1。
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package string;

/**
 * @author CentreS
 * @Description: 实现 strStr() 函数。  给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。如果不存在，则返回  -1。
 * @create 2019/9/4
 */
public class Solution7 {

    public static int strStr(String haystack, String needle) {
        if (needle.equals("")) {
            return 0;
        }
        char[] hay = haystack.toCharArray();
        char[] nee = needle.toCharArray();
        int index = 0;
        for (int i = 0; i < hay.length; i++) {
            for (int j = 0; j < nee.length; j++) {
                if (hay.length -i < nee.length){
                    return -1;
                }
                if (hay[i+j] != nee[j]) {
                    break;
                } else {
                    if (j == 0) {
                        index = i;
                    }
                    if (j == nee.length - 1) {
                        return index;
                    }
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(strStr("aa", "aaaa"));
    }

}
