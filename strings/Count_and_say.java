package strings;

import java.util.Scanner;

/* Problem description
 The count-and-say sequence is a sequence of digit strings defined by the recursive formula:

countAndSay(1) = "1"
countAndSay(n) is the way you would "say" the digit string from countAndSay(n-1), which is then converted into a different digit string.
To determine how you "say" a digit string, split it into the minimal number of groups so that each group is a contiguous section all of the same character. Then for each group, say the number of characters, then say the character. To convert the saying into a digit string, replace the counts with a number and concatenate every saying.
 	
Input: n = 4
Output: "1211"	
below link full problem description.
https://leetcode.com/problems/count-and-say/
 */


public class Count_and_say {

	static Scanner sc = new Scanner(System.in);
	
	public static String countAndSay(int n) {
	      
	        String value = "1";
	        for(int i=0;i<n-1;i++){
	            char a = value.charAt(0);
	            int count=1;
	            StringBuilder s = new StringBuilder();
	            for(int j=1;j<value.length();j++){
	                if(a != value.charAt(j)){
	                    s.append(count);
	                    s.append(a);
	                    count=0;
	                    a=value.charAt(j);
	                }
	                count++;
	            }
	            s.append(count);
	            s.append(a);
	            value = s.toString();
	        }
	        return value;
	        
	    }
	
	
	
	
	public static void main(String[] args) {
	
		System.out.println("Enter the number to count and say");
		int n = sc.nextInt();
		System.out.println(countAndSay(n));
		
		
		
	}

}
