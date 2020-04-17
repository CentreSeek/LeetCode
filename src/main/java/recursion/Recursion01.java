/**
 * Copyright (C), 2019, 寻央大人留书
 * FileName: Recursion01
 * Author:   CentreS
 * Date:     2019/11/4 11:11
 * Description: fibonacci
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package recursion;

/**
 * @Description: fibonacci
 * @author CentreS
 * @create 2019/11/4
 */
public class Recursion01 {

    public static int f(int n){
        if (n <= 1){
            return n;
        }else {
            return f(n-1)+f(n-2);
        }
    }


    public static void main(String[] args) {

    }

    public static final int[] arr = {1,1,2,3,2};
    public static int test(int[] arr){
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            result ^= arr[i];
        }
        return result;
    }

}
