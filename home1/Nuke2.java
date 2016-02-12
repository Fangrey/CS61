/* Nuke2.java */

import java.io.*;

/**  a class whose main method reads a string from keyboard
 *   and prints the same string, with its second character
 *   removed.
 */

class Nuke2 {
	public static void main(String[] arg) throws Exception {
	BufferedReader keyboard;
    String inputLine;

    keyboard = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("Please enter a string");
    System.out.flush();        /* Make sure the line is printed immediately. */
    inputLine = keyboard.readLine();
	
	char[] chars = inputLine.toCharArray();
	
	for (int i = 0; i < chars.length; i++){
	if (i == 1) 
		continue;
	System.out.print(chars[i]);
	}
}
}