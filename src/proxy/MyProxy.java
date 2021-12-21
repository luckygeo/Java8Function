package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyProxy implements InvocationHandler {

    private Object object;

    public MyProxy(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //System.out.println("hello4564564");
        System.out.println(method.getName());
        System.out.println("hello4564564");
        if ("getName".equals(method.getName())) {
            System.out.println("before: " + method.getName());
            Object re = method.invoke(object, args);
            System.out.println("after: " + method.getName());
            return re;
        }
        else {
            return method.invoke(object,args);
        }
    }
}
