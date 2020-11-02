package strings;

public class Reverse_a_string {

	
	static String reverseString(String s) {
		String s2 = "";
		for(int i=s.length()-1;i>=0;i--) {
			s2 = s2+s.charAt(i);
		}
		return s2;
	}
	
	 public static void reverseString(char[] s) {
	        int st=0,e=s.length-1;
	        char temp = ' ';
	        while(st<e){
	            temp = s[st];
	            s[st] = s[e];
	            s[e] = temp;
	            st++;
	            e--;
	        }
	        int i=0;
	        System.out.print("Reversed string ");
	        while(i<s.length){
	          System.out.print(s[i]);
	          i++;
	        }
	        System.out.println();
	    }
	
	public static void main(String[] args) {
		
		String s1 = "Junaid";
		System.out.println("Given string "+s1);
		String s2 = reverseString(s1);
		char s[] = s1.toCharArray();
		reverseString(s);
		System.out.println("Given string "+s1);
		System.out.println("Reversed String "+s2);
		
	}

}
