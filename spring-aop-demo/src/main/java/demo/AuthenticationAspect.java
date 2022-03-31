package demo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
public class AuthenticationAspect {

    @Pointcut("within(demo..*)")
    public void authenticatingPointCut() {
    }

    @Pointcut("within(demo.ShoppingCart.*)")
    public void authorizationPointCut() {
    }

    @Before("authenticatingPointCut() || authorizationPointCut()")
    public void authenticate(JoinPoint jp) {
        //System.out.println(jp.getArgs()[0].toString());
        System.out.println("Authenticating the Request");
    }

}
