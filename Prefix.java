package string;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author vikas
 * 
 * To save all the prefixes. We need to iterate till the length of string + 1. 
 * add the sustring in the arraylist. substring should start at 0 and end at 
 * index.
 *
 */

public class Prefix {

	public static void main(String[] args) {
		
		String text = "house";
		
		List<String> prefix = getPrefix(text);
		
		for(String s : prefix) {
			System.out.println(s);
		}
	}
	
	public static List<String> getPrefix(String text) {
		
		int stringLength = text.length();
		List<String> prefixList = new ArrayList<>();
		
		for(int i = 1; i < stringLength+1; i++) {
			prefixList.add(text.substring(0,i));
		}
		return prefixList;
	}
}
