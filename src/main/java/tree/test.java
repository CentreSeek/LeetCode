package tree;

import java.io.File;
import java.io.FileOutputStream;

/**
 * @program: LeetCode
 * @description:
 * @author: CentreS
 * @create: 2020-08-13 11:16:15
 **/
public class test {
    public static void main(String[] args) {
        int a = 57;
        int b = 10000;
        for (int i = 10; i < b; i++) {
            char[] chars = String.valueOf(i).toCharArray();
            char[] newChars = new char[chars.length - 1];
            for (int j = 0; j < chars.length - 1; j++) {
                newChars[j] = chars[j + 1];
            }
            int i1 = Integer.parseInt(String.valueOf(newChars));
            if (i / a == i1 && i % a == 0) {
                System.out.println(i);
            }
        }
    }

    public static void writeTxt(String txtPath, String content) {
        FileOutputStream fileOutputStream = null;
        File file = new File(txtPath);
        try {
            if (file.exists()) {
                //判断文件是否存在，如果不存在就新建一个txt
                file.createNewFile();
            }
            fileOutputStream = new FileOutputStream(file);
            fileOutputStream.write(content.getBytes());
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
