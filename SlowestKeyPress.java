import java.util.*;
/*
Slowest Key Press
[[0,2],[1,5],[5,12]], where the first element represents a=0, b=1, ... , z=25.
Second element represents the time elapsed for the key press
slowest key press = 12-5=7, equivalent key = 5 i.e. 'f'
*/

public class SlowestKeyPress {
	public static void main(String[] args) {
		
		List<List<Integer>> keyTimes = new ArrayList<List<Integer>>();
		List<Integer> key= new ArrayList<Integer>();
		key.add(0);
	}
	
	public static char slowestKey(List<List<Integer>> keyTimes) {
	    // Write your code here
		int maxTime=0;
    	int charPos=0;
    	int timeElapsed=0;
    	int prevTime=0;
    	for(List<Integer> keyList:  keyTimes) {
    		//System.out.println(keyList);
    		timeElapsed= keyList.get(1);
    		int timeTaken = timeElapsed-prevTime;
    		if(timeTaken > maxTime) {
    			charPos= keyList.get(0);
    			maxTime= timeTaken;
    		}
    		prevTime=timeElapsed;
    	}
    	System.out.println(charPos);
    	System.out.println(maxTime);
    	int charAsciiCode=97 + charPos;
    	
    	return (char) charAsciiCode;
	    }
}
