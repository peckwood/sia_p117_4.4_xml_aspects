package concert.around_advice;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:concert/around_advice/concert_around.xml"})
public class ConcertTest_Around {
	
	@Autowired
	concert.Performance performance;
	
	@Test
	public void testConcert(){
		performance.perform();
	}
}
