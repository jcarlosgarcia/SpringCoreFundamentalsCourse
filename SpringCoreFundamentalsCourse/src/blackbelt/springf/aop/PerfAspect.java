package blackbelt.springf.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class PerfAspect {
	
	@Around("execution(* blackbelt..*(..))")
	public Object doBasicProfiling(ProceedingJoinPoint pjp) throws Throwable {
		
		long whenStarts = System.currentTimeMillis(); 

	    Object result = pjp.proceed();

	    long whenEnds = System.currentTimeMillis();
		System.out.println(pjp.toShortString() + " in: "+ (whenEnds-whenStarts) + "ms");

		return result;

	}

}
