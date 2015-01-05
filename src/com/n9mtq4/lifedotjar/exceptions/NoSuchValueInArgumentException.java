package com.n9mtq4.lifedotjar.exceptions;

/**
 * Created by Will on 1/5/15.
 */
public class NoSuchValueInArgumentException extends Throwable {
	
	public NoSuchValueInArgumentException(String arg, String key) {
		super("No such value for " + key + " in " + arg + ".");
	}
	
	public static String getArg(String[] args) {
		
		String s = "[";
		for (String s1 : args) {
			s.concat(s1 + ",");
		}
		s = s.substring(0, s.length() - 1);
		s = s.concat("]");
		return s;
		
	}
	
}
