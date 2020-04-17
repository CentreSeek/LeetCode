/**
 * Copyright (C), 2019, 寻央大人留书
 * FileName: Staff
 * Author:   CentreS
 * Date:     2019/9/20 10:39
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package test.xml;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @Description:
 * @author CentreS
 * @create 2019/9/20
 */
@XmlRootElement(name="staff")
public class Staff {

    private String name;    // 职员名称
    private int age;        // 职员年龄
    private boolean smoker; // 是否为烟民

    public String getName() {
        return name;
    }
    @XmlElement
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    @XmlElement
    public void setAge(int age) {
        this.age = age;
    }
    public boolean isSmoker() {
        return smoker;
    }
    @XmlAttribute
    public void setSmoker(boolean smoker) {
        this.smoker = smoker;
    }
}
