package concert;

import org.springframework.stereotype.Component;

@Component
public class Audience {
	//@Before("execution (** concert.Performance.perform(..))")
	public void silienceCellphone(){
		System.out.println("Silencing cell phones");
	}
	
	//@Before("execution (** concert.Performance.perform(..))")
	public void takeSeats(){
		System.out.println("Taking seats");
	}
	
	//@Pointcut("execution (** concert.Performance.perform(..))")
	public void performance(){
		
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
