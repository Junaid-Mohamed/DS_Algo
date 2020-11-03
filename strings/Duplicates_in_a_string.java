package strings;

public class Duplicates_in_a_string {

	
	static void findDuplicates(String s) {
		
		int c[] = new int[256];

		for(int i=0;i<s.length();i++) {
			c[s.charAt(i)]++; 
		}
		for(int i=0;i<256;i++) {
			if(c[i]>1 && (char)i != ' ') {
				System.out.println((char)i +"-> has count of ->"+c[i]);
			}
		}
		
	}
	
	public static void main(String[] args) {
		
		String s = "geeks for geeks";
		findDuplicates(s);

	}

}
