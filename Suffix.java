package string;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author vikas
 * 
 * In this program, I am trying to get the list of suffix in a string.
 * Create an arrayList. Iterate till the length of string.
 * At each iteration add a substring in the arrayList such that,
 * the substring starts at index and ends at the length of string.
 * Return the arrayList
 *
 */

public class Suffix {

	public static void main(String[] args) {
		
		String text = "hello";
		
		List<String> list = suffixList(text);
		
		for(String s : list) {
			System.out.println(s);
		}

	}
	
	public static List<String> suffixList(String text) {
		
		int stringLength = text.length();
		List<String> sList = new ArrayList<>();
		
		for(int i = 0; i < stringLength; i++) {
			sList.add(text.substring(i, stringLength));
		}
		return sList;
	}

}
