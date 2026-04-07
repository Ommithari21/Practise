package restapi.example.practise.Aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class CommonPointcutConfig {

    @Pointcut("execution(* restapi.example.practise.Aop.BusinessAopExample.*(..))")
      public void businesslogic(){

    }
}
