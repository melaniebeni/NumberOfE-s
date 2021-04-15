import javax.swing.JOptionPane;


/**
 * Reads a sentence typed by the user into text box
 * returns the number of upper and lower case e's
 * unless the user types any case variation of stop
 * @author melaniebeni
 * @date 09/19/19
 *
 */

public class Project0 {
	public static void main(String[] args) {
		//loop to allow user to repeatedly enter sentences until they enter stop
		while (true) {
			// count of e's read so far
			int lower=0, upper=0; 
		    String input;
			input= JOptionPane.showInputDialog(null, "Please enter a sentence: ");
			//If stop is read in any case the program will exit
			if (input.equalsIgnoreCase("StOp")) {
				System.exit(0);
			}
			// loop to read through the sentence and count the e's
			for(int i=0; i<input.length();i++) {
				if (input.charAt(i)=='e')lower++;
				if (input.charAt(i)=='E')upper++;
				
			}
			//Shows a Dialog box with the number of upper and lower case e's in the typed sentence
			JOptionPane.showMessageDialog(null, "Number of lowercase e's : " + lower + "\n"+ "Number of uppercase E's : " + upper);
		}
		
	}

}
