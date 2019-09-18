/**
	This is the launcher class which starts the program
	@author Wade Muncy
	@version 1.0
	Programming Project One
	CS322 - Compiler Construction
	Fall 2019
**/

import java.util.*;

public class Launcher{

public static void main(String[] args) {
	
	String fileName = "auth.log";
        int printFlag = 0;	
	PatternMatcher match = new PatternMatcher();
	
	Scanner sc = new Scanner(fileName);
	int count = 0;
	while (sc.hasNextLine()){
		match.process(sc.nextLine());
                count++;
	}
	System.out.println(count + " lines in the log file were parsed");
        System.out.println("There are " + match.size(0) + " unique IP addresses in the log");
        System.out.println("There are " + match.size(1) + " unique users in the log");
	match.printHash(printFlag);
        
        
	
	//instantiate the class that contains the pattern matching and hashmap storage
	
	//iterate through the log file and pass each line from the file to the class that implements pattern matching and hashmap storage for processing
	
	//print summary output after each file has been processed
	
	
	
	
	
	
	
	
}

}