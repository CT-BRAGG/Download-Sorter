// Counts the number of files in downloads

import java.util.Scanner;

public class CountFiles {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);	
		int count = 0;
		String currLine = "";
		
		while (input.hasNextLine()) {	
			currLine = input.nextLine();
			count++;
		}

		System.out.println("num of files: "+count);
	}
}
