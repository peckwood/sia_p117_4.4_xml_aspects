package concert.around_advice;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Component;

@Component
public class Audience_Around {
	
	public void watchPerformance(ProceedingJoinPoint jp){
		try {
			silienceCellphone();
			takeSeats();
			jp.proceed();
			applause();
		} catch (Throwable e) {
			demandRefund();
		}
	}
	
	//@Before("execution (** concert.Performance.perform(..))")
	public void silienceCellphone(){
		System.out.println("Silencing cell phones");
	}
	
	//@Before("execution (** concert.Performance.perform(..))")
	public void takeSeats(){
		System.out.println("Taking seats");
	}
	
	//@AfterReturning("performance()")
	public void applause() {
	System.out.println("CLAP CLAP CLAP!!!");
	}
	
	//@AfterThrowing("performance()")
	public void demandRefund(){
		System.out.println("Demanding refund");
	}
	
}
