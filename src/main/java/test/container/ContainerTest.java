package test.container;

import java.util.Locale;
import java.util.ResourceBundle;

public class ContainerTest {
    public static void main(String[] args) {
        ContainerTest test = new ContainerTest();
        ResourceBundle bundleCN = test.getBundle("zh", "CN", "msg");
        test.printNaAndUn(bundleCN);
        ResourceBundle bundleUS = test.getBundle("en", "US", "msg");
        test.printNaAndUn(bundleUS);
    }
    public ResourceBundle getBundle(String lang, String country, String source){
        Locale myLocal = new Locale(lang, country);
        return ResourceBundle.getBundle(source , myLocal);
    }
    public void printNaAndUn(ResourceBundle bundle){
        if (bundle.containsKey("name")){
            System.out.println("name: " + bundle.getString("name"));
        }
        if (bundle.containsKey("university")){
            System.out.println("university: " + bundle.getString("university"));
        }
    }
}
