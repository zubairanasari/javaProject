package learn.java.methodref;

import java.util.Arrays;

public class MethodOfArbitraryObject {

	public static void main(String[] args) {
		String[] stringArray = { "Steve", "Rick", "Aditya", "negan", "Lucy", "Sansa", "Jon"};
		
		Arrays.sort(stringArray,String::compareToIgnoreCase);
		for(String str : stringArray) {
			System.out.println(str);
		}
		
		String str = "This is String.";
		System.out.println(str);
		//Predicate<Character> ch = String::charAt;
	}

}
