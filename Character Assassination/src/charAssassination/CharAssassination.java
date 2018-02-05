//Jack Hosier, Java Data Structures 
package charAssassination;

public class CharAssassination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch = ' ';
		System.out.println("A char: " + ch);
		
		//When char ch is set to 'AA', '', and "A", the program crashes.
		//AA is two chars, and char can only handle 1 character at a time.
		//'' is null, so we get a RunTime Error. 
		//"A" is a String, which is different from a char in that it can house multiple characters.
	}

}
