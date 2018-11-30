package learn.java.examples;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class CountCharInString {

	public static void main(String[] args) {
		
		String str = "kdjdiefdjhyenfjhlewivnfuweyalsdjfgh";
		Map<Character, Integer> charMap = new HashMap<>();
		
		char[] charArray = str.toCharArray();
		
		for(char ch : charArray) {
			if(charMap.containsKey(ch)) {
				charMap.put(ch, charMap.get(ch)+1);
			}
			else
			{
				charMap.put(ch, 1);
			}
		}
		System.out.println("Using normal java for each....");
		for (Entry<Character,Integer> entrySet : charMap.entrySet()) {
			if(entrySet.getValue() > 1)
				System.out.println(entrySet.getKey()+"\t"+entrySet.getValue());
		}
		System.out.println("Using Java 8 Feature...");
		charMap.forEach((key, value1) -> {
			if(value1 > 1) 
				System.out.println(key+"\t"+value1);
			});
	}

}
