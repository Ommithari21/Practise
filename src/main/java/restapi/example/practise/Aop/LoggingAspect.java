package restapi.example.practise.Aop;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
@Aspect
public class LoggingAspect {
    Logger logger = LoggerFactory.getLogger(getClass());

    //pointcut add here
    //for package
    //  execution (* PACKAGE.*.*(..))
    @Before("restapi.example.practise.Aop.CommonPointcutConfig.businesslogic()")
    public void loggingInfo(JoinPoint joinPoint) {
        logger.info(" Before method is called : {} ",joinPoint);
    }

    @After("execution(* restapi.example.practise.Aop.BusinessAopExample.*(..))")
    public void loggingInfoafter(JoinPoint joinPoint) {
        logger.info(" After method is called : {} ",joinPoint);
    }

    @AfterThrowing(pointcut = "execution(* restapi.example.practise.Aop.BusinessAopExample.*(..))",
            throwing = "exception")
    public void loggingInfoafterexception(JoinPoint joinPoint) {
        logger.info(" after Exception method is called : {} ",joinPoint);
    }

    @AfterReturning("execution(* restapi.example.practise.Aop.BusinessAopExample.*(..))")
    public void loggingInfoafterreturing(JoinPoint joinPoint) {
        logger.info(" after returing   is called : {} ",joinPoint);
    }

}
