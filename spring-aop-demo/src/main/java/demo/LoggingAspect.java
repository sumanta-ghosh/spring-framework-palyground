package demo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* demo.ShoppingCart.checkout(..))")
    public void logger() {
        System.out.println("Pre loggers");
    }

    @After("execution(* *.*.checkout(..))")
    public void logger2() {
        System.out.println("Post loggers");
    }

    @Pointcut("execution(* demo.ShoppingCart.quantity(..))")
    public void afterReturningPointCut() {
    }

    @AfterReturning(pointcut = "afterReturningPointCut()", returning = "quan")
    public void logQuantity(int quan) {
        System.out.println("Log quantity=" + quan);
    }

}
