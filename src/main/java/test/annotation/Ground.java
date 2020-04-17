/**
 * Copyright (C), 2019, 寻央大人留书
 * FileName: Ground
 * Author:   CentreS
 * Date:     2019/9/5 10:03
 * Description: 测试场景
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package test.annotation;

import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;

/**
 * @author CentreS
 * @Description: 测试场景
 * @create 2019/9/5
 */
public class Ground {
    public static void main(String[] args) {

        try {
            boolean hasAnnotation = Testclass.class.isAnnotationPresent(TestAnnotation.class);
            Testclass test = new Testclass();
            if (hasAnnotation) {
                TestAnnotation testAnnotation = Testclass.class.getAnnotation(TestAnnotation.class);
                Field fieldId = Testclass.class.getDeclaredField("id");
                Field fieldMsg = Testclass.class.getDeclaredField("msg");
                Method method = Testclass.class.getMethod("print");
                fieldId.setAccessible(true);
                fieldMsg.setAccessible(true);
                fieldId.set(test, 12);
                fieldMsg.set(test, "fdsfds");
                method.invoke(test);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
