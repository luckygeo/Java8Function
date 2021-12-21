package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class TestProxy {
    public static void main(String[] args) throws Exception{
        UserService userService = new UserServiceImpl();
        InvocationHandler handler = new MyProxy(userService);
        UserService userService1 = (UserService) Proxy.newProxyInstance(userService.getClass().getClassLoader(), userService.getClass().getInterfaces(), handler);


        userService1.getName("a");

    }
}
