package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class SayHelloProxy implements InvocationHandler {
    Object delegate;
    public Object bind(Object delegate){
        this.delegate = delegate;
        return Proxy.newProxyInstance(delegate.getClass().getClassLoader(),delegate.getClass().getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = null;
        if (method.getName().equals("sayHelloToMen")){
            System.out.println("fdsafsfsd");
            result = method.invoke(this.delegate, args);
        }

        return result;
    }

    public static void main(String[] args) {
        SayHelloImpl impl = new SayHelloImpl();
        SayHelloProxy proxy = new SayHelloProxy();
        SayHello s = (SayHello) proxy.bind(impl);
        s.sayGoodBye("tom");
        s.sayHelloToMen("jerry");
    }
}
