package main.java;

import main.java.model.Message;
import main.java.service.MessageService;
import main.java.service.MessageServiceImpl;
import main.java.service.TextService;
import net.sf.cglib.core.ReflectUtils;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MessageServiceApplication {

    public static void main(String[] args) throws Exception {
        MessageService messageService = new MessageServiceImpl();
        messageService.addMessage("Hello!");
        messageService.printMessage();
        MessageService textService = new TextService();
        System.out.println();
        MessageService messageServiceProxy = (MessageService) Proxy.newProxyInstance(messageService.getClass().getClassLoader(), messageService.getClass().getInterfaces(), (proxy, method, args12) -> {
            System.out.println("I'm a JD Proxy");
            Object result = method.invoke(textService);
            return result;
        });
        System.out.println(messageService.getClass());
        messageService.printMessage();
        System.out.println();
        System.out.println(messageServiceProxy.getClass());
        messageServiceProxy.printMessage();
        System.out.println();
        MessageService messageServiceCGLIBProxy = (MessageService) Enhancer.create(messageService.getClass(), (MethodInterceptor) (obj, method, args1, proxy) -> {
            System.out.println("I'm a CGLIB Proxy");
            Object result = method.invoke(messageService);
            return result;
        });
        System.out.println(messageServiceCGLIBProxy.getClass());
        messageServiceCGLIBProxy.printMessage();
    }

}
