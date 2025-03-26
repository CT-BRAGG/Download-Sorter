// Determines the Extenstion of a file

import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;

public class BuildPath {
	private static HashMap<String, String> extLocations = null;
	private static final String homeDir = "/home/carson/";

	/** finds path based on ext */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);	
		String fileName = "";
		String ext = "";
		String filePath = "no bueno";
    
    		try {
			// build list of extension location mappings
		  	extLocations = new HashMap<>();
		  	buildExtLocList();

		  	{ // get file extension
		    		int idx = 0; 
			  	String[] buffer = new String[0];

			  	fileName = input.nextLine();
			  	fileName = fileName.trim();
				fileName = fileName.toLowerCase();
			  	buffer = fileName.split("\\.");
			  	idx = buffer.length - 1;
			  	ext = buffer[idx];
		  	}

		  	if (extLocations.containsKey(ext)) {
			  	String loc = extLocations.get(ext);
			  	filePath = homeDir+loc;
		  	}
    		} catch (Exception ex) {
    			// it is what it is  
    		} 

		System.out.println(filePath);
	}
	/** builds list of locations for extenstions*/
	public static void buildExtLocList() {
		String[] docs = {
			"pdf",
			"doc",
			"docx",
			"xlsx",
			"odt",
			"ods",
			"txt",
			"rtf"
		};
		String[] images = {
			"png",
			"jpg",
			"bmp",
			"gif",
			"svg"
		};
		String[] compressed = {
			"zip",
			"7z",
			"gz",
			"deb",
			"zipx",
			"rar"
		};
		String[] code = {
			"java",
			"cpp",
			"py",
			"h",
			"php",
			"html",
			"css"
		};

		addToExtList("Documents/new-docs", docs);
		addToExtList("Pictures", images);
		addToExtList("files/compressed", compressed);
		addToExtList("files/code/new-files", code);
	}
	/** maps the list of extensions to the given location */
	private static void addToExtList(String loc, String[] exts) {
		for (String ext: exts) {
			extLocations.put(ext, loc);		
		}		
	}
}
