package strings;

public class One_string_is_rotation_of_another {

	
	static boolean isRotation(String s1,String s2) {
		
		if(s1.length()!=s2.length()) return false; // if length is not same they can't be rotations of each other. 
		
		// if length's are same then return s1 concatenated with s1 and s2 should be substring of this concatenated string.
		return (s1.concat(s1).indexOf(s2)!=-1);
	}
	
	public static void main(String[] args) {
		
		String s1 = "ABACD";
		String s2 = "CDABA";
		if(isRotation(s1,s2)) {
		System.out.println("Given strings are rotations of each other.");	
		}
		else System.out.println("Given strings are not rotations of each other.");
		
		
		
	}

}
