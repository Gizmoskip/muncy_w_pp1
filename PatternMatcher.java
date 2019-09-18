/**
	This is the pattern matching and hashmap storage class
	@author Wade Muncy
	@version 1.0
	Programming Project One
	CS322 - Compiler Construction
	Fall 2019
**/
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class PatternMatcher{
static HashMap<String, Integer> map = new HashMap<>();
static HashMap<String, Integer> map2 = new HashMap<>();
public static void main(String[] args){
}


public static void process(String line){
	searchUser(line);
	searchIP(line);
}

public static void searchUser(String line){

String pattern = "([u][s][e][r]\\s\\w+)";
	
    Pattern r = Pattern.compile(pattern);

    Matcher m = r.matcher(line);
	
	if(m.find())
            map2.put(m.group(1),1);
}

public static void searchIP(String line){
	
String pattern = "((\\d{1,3})(\\.)(\\d{1,3})(\\.)(\\d{1,3})(\\.)(\\d{1,3}))";
	
    Pattern r = Pattern.compile(pattern);

    Matcher m = r.matcher(line);
	if(m.find())
		map.put(m.group(0),map.get(m.group(0))+1);
}

public static int size(int hashID){
	if(hashID == 0)
		return map.size();
        else if(hashID == 1)
		return map2.size();
	else return 0;
	
}

public static void printHash(int hashID){
	if(hashID == 0){
            
	}
	else if(hashID == 1){
        System.out.println(Arrays.asList(map));
        }
        else if(hashID == 2){
        System.out.println(Arrays.asList(map2));
        }
}
}