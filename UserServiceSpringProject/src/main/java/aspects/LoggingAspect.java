package main.java.aspects;

import org.aspectj.ajdt.internal.compiler.ast.Proceed;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* main.java.service.UserService.*(..))")
    public void beforeMethod(JoinPoint joinPoint) {
        System.out.println("Before method calls: " + joinPoint.getSignature().getName());
    }

    @After("within(main.java.service.*)")
    public void afterMethod(JoinPoint joinPoint) {
        System.out.println("After method calls: " + joinPoint.getSignature().getName());
    }

    @Around("target(main.java.service.UserService)")
    public Object aroundMethod(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("Around before method calls: " + joinPoint.getSignature().getName());
        Object result = joinPoint.proceed();
        System.out.println("Around after method calls: " + joinPoint.getSignature().getName());
        return result;
    }

    @Before("@target(main.java.annotations.ThisClassMethods)")
    public void beforeAnnotatedClassMethod(JoinPoint joinPoint) {
        System.out.println("Before Annotated Class method calls: " + joinPoint.getSignature().getName());
    }

    @After("@annotation(main.java.annotations.ThisMethods)")
    public void afterAnnotatedMethod(JoinPoint joinPoint) {
        System.out.println("After Annotated method calls: " + joinPoint.getSignature().getName());
    }


}
