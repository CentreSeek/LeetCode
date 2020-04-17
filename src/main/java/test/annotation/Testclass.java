/**
 * Copyright (C), 2019, 寻央大人留书
 * FileName: Testclass
 * Author:   CentreS
 * Date:     2019/9/5 10:15
 * Description: 测试类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package test.annotation;

/**
 * @Description: 测试类
 * @author CentreS
 * @create 2019/9/5
 */
@TestAnnotation(id = 12, msg = "fdssdfad")
public class Testclass {

    private int id ;
    private String msg;
    public void print(){
        System.out.println(id + msg);
    }
    @Check("invoke a")
    int a;

}
