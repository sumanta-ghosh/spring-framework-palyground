package demo;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
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

}
