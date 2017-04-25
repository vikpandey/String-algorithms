package string;

import java.util.ArrayList;
import java.util.List;

public class LongestCommonPrefix {

	public static void main(String[] args) {

		String text1 = "hellk";
		String text2 = "hellook";
		List<String> stringList = new ArrayList<>();

		stringList.add("hello");
		stringList.add("hell");
		stringList.add("hellook");
		stringList.add("helo");

		System.out.println(lcp(text1, text2));
		System.out.println();
		System.out.println();
		// System.out.println(stringList);
		// System.out.println(lcpList(stringList));

	}

	public static List<String> lcpList(List<String> list) {

		Integer stringLength = null;
		List<String> sList = new ArrayList<>();

		for (String s : list) {
			if (stringLength == null && list.size() != 0) {
				stringLength = s.length();
			}
			sList.add(s);
		}

		return sList;
	}

	public static String lcp(String text1, String text2) {

		int stringLength = Math.min(text1.length(), text2.length());
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < stringLength; i++) {
			/*
			 * if(text1.charAt(i) != text2.charAt(i)) { return
			 * text1.substring(0, i); }
			 */
			if (text1.charAt(i) == text2.charAt(i)) {
				sb.append(text1.charAt(i));
			}
		}
		return sb.toString();
		// return text1.substring(0, stringLength);
	}
}
