package test;

class ClassTypeTest1 {
    ClassTypeTest1(){
        System.out.println("class init");
    }
    public static void staticFun(){
        System.out.println("run static function");
    }
    public static String str = "static String";


}

public class ClassTypeTest{
    public static void main(String[] args) {
        Class c = ClassTypeTest.class;
        ClassTypeTest1.staticFun();
        System.out.println(ClassTypeTest1.str);
        ClassTypeTest1 test = new ClassTypeTest1();

    }
}
