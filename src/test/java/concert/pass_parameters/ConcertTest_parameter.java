package concert.pass_parameters;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:concert/pass_parameters/concert_parameter.xml"})
public class ConcertTest_parameter {
	
	@Autowired
	CompactDisc cd;
	
	@Test
	public void testConcert(){
		cd.playTrack(0);
		cd.playTrack(1);
		cd.playTrack(0);
	}
}
