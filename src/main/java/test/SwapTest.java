/**
 * Copyright (C), 2019, 寻央大人留书
 * FileName: SwapTest
 * Author:   CentreS
 * Date:     2019/9/19 16:34
 * Description: java实现swap
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package test;

import java.lang.reflect.Field;

/**
 * @author CentreS
 * @Description: java实现swap
 * @create 2019/9/19
 */
public class SwapTest {

    public static void swap(Integer a, Integer b) throws Exception {
        Field value = Integer.class.getDeclaredField("value");
        value.setAccessible(true);
        value.setInt(a, a ^ b);
        value.setInt(b, a ^ b);
        value.setInt(a, a ^ b);
    }

    public static void main(String[] args) throws Exception {
        Double a = 0.5;
        Double b = 1.1;
        System.out.println(a + b);
    }

}
