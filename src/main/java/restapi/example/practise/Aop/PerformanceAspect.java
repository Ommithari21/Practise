package restapi.example.practise.Aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class PerformanceAspect {
    Logger logger = LoggerFactory.getLogger(getClass());

    @Around("execution(* restapi.example.practise.Aop.BusinessAopExample.*(..))")
public  Object cal(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
long timemillisecound=System.currentTimeMillis();

    Object returnvalue = proceedingJoinPoint.proceed();

long stoptimemillies=System.currentTimeMillis();

long excepcution=stoptimemillies-timemillisecound;
 logger.info("Around aspect {} method excecuted in {} ms",proceedingJoinPoint,excepcution);
 return returnvalue;
    }

}
