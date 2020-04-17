/**
 * Copyright (C), 2019, 寻央大人留书
 * FileName: Main
 * Author:   CentreS
 * Date:     2019/9/20 10:40
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package test.xml;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @author CentreS
 * @create 2019/9/20
 */
public class Main {

    public static void main(String[] args) throws Exception {

        JAXBContext context = JAXBContext.newInstance(Department.class,Staff.class);    // 获取上下文对象
        Marshaller marshaller = context.createMarshaller(); // 根据上下文获取marshaller对象

//        marshaller.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");  // 设置编码字符集
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true); // 格式化XML输出，有分行和缩进

//        marshaller.marshal(getSimpleDepartment(),System.out);   // 打印到控制台

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        marshaller.marshal(getSimpleDepartment(), baos);
        String xmlObj = new String(baos.toByteArray());         // 生成XML字符串
        System.out.println(xmlObj.replace("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n",""));
    }

    /**
     * 生成一个简单的Department对象
     * @return
     */
    private static Department getSimpleDepartment() {
        List<Staff> staffs = new ArrayList<Staff>();

        Staff stf = new Staff();
        stf.setName("周杰伦");
        stf.setAge(30);
        stf.setSmoker(false);
        staffs.add(stf);
        stf.setName("周笔畅");
        stf.setAge(28);
        stf.setSmoker(false);
        staffs.add(stf);
        stf.setName("周星驰");
        stf.setAge(40);
        stf.setSmoker(true);
        staffs.add(stf);

        Department dept = new Department();
        dept.setName("娱乐圈");
        dept.setStaffs(staffs);

        return dept;
    }
}
