package proxy;

public class SayHelloImpl implements SayHello{
    @Override
    public void sayHelloToMen(String name) {
        System.out.println("hello"+name);
    }

    @Override
    public void sayGoodBye(String name) {
        System.out.println("goodbye"+name);
    }
}
