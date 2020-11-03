package strings;

public class Palindrome {

	
	static boolean isPalindrome(char[] s) {
		
		int start=0,end=s.length-1;
		while(start++<end--) {
			if(s[start]!=s[end]) {
				return false;
			}			
		}
		return true;
	}
	
	public static void main(String[] args) {
		
		String s1 = "aabba";
		if(isPalindrome(s1.toCharArray())) System.out.println("Given string is palindrome");
		else System.out.println("Given string is not a palindrome.");
	}

}
