package test.container;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;

public class JsonTest {
    public static void main(String[] args) {
        JsonTest test = new JsonTest();
        Student student = test.readXml();
        String s = test.toJson(student);
        // 输出json
        System.out.println(s);
        test.writeXml(student);

    }

    public  Student readXml(){
        Student student = new Student();
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = factory.newDocumentBuilder();
            Document document = documentBuilder.parse("src/score.xml");
            Element documentElement = document.getDocumentElement();
            student.setName(documentElement.getElementsByTagName("name").item(0).getTextContent());
            student.setScore(Integer.parseInt(documentElement.getElementsByTagName("score").item(0).getTextContent()));
            student.setSubject(documentElement.getElementsByTagName("subject").item(0).getTextContent());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return student;
    }

    public String toJson(Student student){
        Gson gson = new Gson();
        String s = gson.toJson(student);
        return s;
    }

    public void writeXml(Student stude){

        try {
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dbBuilder = dbFactory.newDocumentBuilder();
            Document document = dbBuilder.newDocument();
            if (document != null)
            {
                Element student = document.createElement("student");
                Element name = document.createElement("name");
                name.appendChild(document.createTextNode(stude.getName()));
                Element core = document.createElement("score");
                core.appendChild(document.createTextNode(stude.getScore().toString()));
                Element subject = document.createElement("subject");
                subject.appendChild(document.createTextNode(stude.getSubject()));

                document.appendChild(student);
                student.appendChild(name);
                student.appendChild(subject);
                student.appendChild(core);

                TransformerFactory transformerFactory = TransformerFactory.newInstance();
                Transformer transformer = transformerFactory.newTransformer();
                DOMSource source = new DOMSource(document);

                //定义目标文件
                File file = new File("src/score2.xml");
                StreamResult result = new StreamResult(file);

                //将xml内容写入到文件中
                transformer.transform(source, result);

                System.out.println("write xml file successfully");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
