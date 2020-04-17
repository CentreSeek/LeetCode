/**
 * Copyright (C), 2019, 寻央大人留书
 * FileName: TestAnnotation
 * Author:   CentreS
 * Date:     2019/9/4 20:13
 * Description: 注解测试
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package test.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author CentreS
 * @Description: 注解测试
 * @create 2019/9/4
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface TestAnnotation {
    int id() default -1;

    String msg() default "TestAnnotation";
}
