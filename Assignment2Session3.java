package assignments;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Assignment2Session3 {

	public static void main(String[] args) throws IOException {
		// Takes input from console as charectors
		InputStreamReader isr = new InputStreamReader(System.in);
		//converts character to bytes
		BufferedReader br = new BufferedReader(isr);
		//asks for input of first string
		System.out.println("Enter the String S1");
		
		String s1 = br.readLine();
		// asks for input of second string
		System.out.println("Enter the String S2");
		
		String s2 = br.readLine();
		
		boolean same = true;
		// checks weather both stings are same
		same = s1.equals(s2);
		

		if ( same == true) {
		System.out.println("it's true");
		}
		else {
		System.out.println("it's false");
		}

	}

}
