// Clean File Name 
// desc: prepares file name by removing outer 
//       whitespace and adding lashses to spaces

import java.util.Scanner;

public class CleanFileName {	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String fileName = input.nextLine();
		String[] fileNameParts = new String[0];

		fileName = fileName.trim();
		if (fileName.indexOf(" ") != -1) {
			fileNameParts = fileName.split(" ");	
			fileName = "";

			for (int idx = 0; idx < fileNameParts.length; idx++) {
				if (idx != (fileNameParts.length - 1)) {
					fileName += fileNameParts[idx]+"\\ ";
				} else {
					fileName += fileNameParts[idx];
				}
			}
		}

		System.out.println(fileName);
	}
}
