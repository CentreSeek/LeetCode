package test.assertTest;

import java.sql.SQLOutput;

public class AssertTest {
    public void doSomeThing(int a){
        System.out.println("into doSomeThing");
        assert a>0 : "这是个非法数字";
        System.out.println("a+1="+(a+1));
    }


    public static void main(String[] args) {
        AssertTest test = new AssertTest();
        test.doSomeThing(-1);
        int b = 10;
        assert b<=0 : "fdsfdsf";
    }
}
