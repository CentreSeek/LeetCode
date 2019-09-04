/**
 * Copyright (C), 2019, 寻央大人留书
 * FileName: Solution8
 * Author:   CentreS
 * Date:     2019/9/4 16:26
 * Description: 报数序列是一个整数序列，按照其中的整数的顺序进行报数，得到下一个数
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package string;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author CentreS
 * @Description: 报数序列是一个整数序列，按照其中的整数的顺序进行报数，得到下一个数
 * @create 2019/9/4
 */
public class Solution8 {

    public String countAndSay(int n) {
        String str = "1";
        if (n < 1) {
            return "";
        }
        n--;
        for (int i = 0; i < n; i++) {
            str = tool(str);
        }
        return str;
    }

    public String tool(String str) {
        StringBuilder builder = new StringBuilder();
        List<Entry> list = new ArrayList<Entry>();
        char[] chars = str.toCharArray();
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            count++;
            if (i == chars.length - 1 || chars[i] != chars[i + 1]) {
                Entry entry = new Entry();
                entry.count = count;
                entry.num = String.valueOf(chars[i]);
                list.add(entry);
                count = 0;
            }
        }
        for (int i = 0; i < list.size(); i++) {
            builder.append(list.get(i).toString());
        }
        return builder.toString();

    }

    private class Entry {
        public int count;
        public String num;

        @Override
        public String toString() {
            return count + "" + num;
        }

    }

    public static void main(String[] args) {
        Solution8 temp = new Solution8();
        System.out.println(temp.countAndSay(5));
    }

}
