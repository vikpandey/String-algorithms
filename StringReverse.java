package string;

public class StringReverse {

	public static void main(String[] args) {
		
		String text = "vikas";
		
		reverse(text);
	}
	
	public static void reverse(String text) {
		
		int stringLength = text.length();
		StringBuilder sb = new StringBuilder();
		
		for(int i = stringLength-1; i >= 0; i--) {
			sb.append(text.charAt(i));
		}
		System.out.println(sb.toString());
	}
}
