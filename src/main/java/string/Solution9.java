/**
 * Copyright (C), 2019, 寻央大人留书
 * FileName: Solution9
 * Author:   CentreS
 * Date:     2019/9/5 11:25
 * Description: 最长公共前缀
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package string;

import javax.swing.plaf.metal.MetalIconFactory;
import java.lang.reflect.WildcardType;

/**
 * @author CentreS
 * @Description: 编写一个函数来查找字符串数组中的最长公共前缀。
 * <p>
 * 如果不存在公共前缀，返回空字符串 ""。
 * @create 2019/9/5
 */
public class Solution9 {

//    public String longestCommonPrefix(String[] strs) {
//        char character = ' ';
//        int j = 0;
//        if (strs == null || strs.length == 0) {
//            return "";
//        }
//        while (true) {
//            for (int i = 0; i < strs.length; i++) {
//                if (strs[i] == "") {
//                    return "";
//                }
//                if (i == 0) {
//                    character = strs[i].charAt(j);
//                } else {
//                    if (strs[i].charAt(j) != character) {
//                        return strs[0].substring(0, j);
//                    }
//                    if (i == strs.length - 1) {
//                        j++;
//                    }
//                }
//            }
//        }
//    }

    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        int index = 0;
        int minLength = strs[0].length();
        for (int i = 0; i < strs.length; i++) {
            if (strs[i].length() < minLength){
                index = i;

            }
        }
        if (strs[index] == ""){
            return "";
        }
        char[] minStr = strs[index].toCharArray();
        for (int i = 0; i < strs.length; i++) {
            for (int j = 0; j < 0; j++) {

            }
        }
        return null;
    }

    public static void main(String[] args) {
        Solution9 s = new Solution9();
        String[] strs1 = {"flower", "flow", "flight"};
        System.out.println(s.longestCommonPrefix(strs1));
        String[] strs2 = {};
        System.out.println(s.longestCommonPrefix(strs2));
        String[] strs3 = {""};
        System.out.println(s.longestCommonPrefix(strs3));
    }
}
