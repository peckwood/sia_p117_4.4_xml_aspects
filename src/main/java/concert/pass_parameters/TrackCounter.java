package concert.pass_parameters;

import java.util.HashMap;
import java.util.Map;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class TrackCounter {
	private Map<Integer, Integer> trackCounts = new HashMap<Integer, Integer>();
	//args(trackNumber)indicates that any int argument that is passed into the execution of playTrack() 
	//should also be passed into the advice
	//@Pointcut("execution (** concert.parameterized_advice.BlankDisc.playTrack(int)) && args(trackNumber)")
	//trackNumber matches the method parameter trackNumber
	public void trackPlayed(int trackNumber){}
	
	//@After("trackPlayed(trackNumber)")
	public void countTrack(int trackNumber){
		int currentCount = getPlayCount(trackNumber);
		trackCounts.put(trackNumber, ++currentCount);
		System.out.println("[TrackCounter] track "+trackNumber+" played "+currentCount+" times");
	}
	
	private int getPlayCount(int trackNumber){
		return trackCounts.containsKey(trackNumber) ? trackCounts.get(trackNumber): 0;
	}
}
