package collectionTasks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class InterviewQuestionDeviceName {

	public static void main(String[] args) {
		/*
Interview Question - Device Names

assuming you building a program that can rename the device name for wifi connection. Because of Wifi, all devices name cannot be duplicate. if your program find the duplicate name (2nd or more). you program should append a digit to that device name.

input:
[fan,tv,tv,oven,laptop,phone,tv]
output:
[fan,tv,tv1,oven,laptop,phone,tv2]

input:
[a,a,a,b,c,c,a]
output:
[a,a1,a2,b,c1,c2,a3]
Constraint:

The maximum connect devices cannot exceed 50

		 */
		String[] dN = {"fan", "tv", "tv" ,"oven" ,"laptop" ,"phone" ,"tv"};
		System.out.println(renameDevice(dN));
		
		String[] dN1 = {"a", "a", "a", "b", "c", "c", "a"};
		System.out.println(renameDevice(dN1));
		
	}
	
	public static ArrayList<String> renameDevice(String[] dN){
		Map<String, Integer> m = new HashMap<>();
		ArrayList<String> deviceName = new ArrayList<>();
	
		for(String e : dN) {
			if(!m.containsKey(e))	{
				m.put(e, 0);
				deviceName.add(e);
			} else {
				m.put(e, m.get(e)+1);
				deviceName.add(e+(m.get(e)));
			}
			if(deviceName.size() >= 50) {
				System.out.println("The maximum connect devices have reached the limit");
				break;
			}
	
		}
		return deviceName;	
		
	}

}
