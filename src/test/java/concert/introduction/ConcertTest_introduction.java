package concert.introduction;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:concert/introduction/concert_introduction.xml"})
public class ConcertTest_introduction {
	
	@Autowired
	Performance performance;
	
	@Test
	public void testConcert_introductiion(){
		performance.perform();
		Encoreable encoreablePerformance = (Encoreable) performance; 
		encoreablePerformance.encore();
	}
}
