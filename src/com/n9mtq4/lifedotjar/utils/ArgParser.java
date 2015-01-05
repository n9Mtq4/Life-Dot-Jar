package com.n9mtq4.lifedotjar.utils;

import com.n9mtq4.lifedotjar.exceptions.NoSuchValueInArgumentException;

/**
 * Created by Will on 1/5/15.
 */
public class ArgParser {
	
	private String[] args;
	
	public ArgParser(String[] args) {
		this.args = args;
	}
	
	public boolean contains(String s) {
		for (String s1 : args) {
			if (s1.equals(s)) return true;
		}
		return false;
	}
	
	public boolean containsIgnoreCase(String s) {
		for (String s1 : args) {
			if (s1.equalsIgnoreCase(s)) return true;
		}
		return false;
	}
	
	public String getString(String key) throws NoSuchValueInArgumentException {
		if (!containsIgnoreCase(key)) {
			throw new NoSuchValueInArgumentException(NoSuchValueInArgumentException.getArg(args), key);
		}
		int i = 0;
		for (; i < args.length; i++) {
			if (args[i].equalsIgnoreCase(key)) break;
		}
		return args[++i];
	}
	
	public int getInt(String key) throws NoSuchValueInArgumentException, NumberFormatException {
		return Integer.parseInt(getString(key));
	}
	
	public double getDouble(String key) throws NoSuchValueInArgumentException, NumberFormatException {
		return Double.parseDouble(getString(key));
	}
	
	public String[] getArgs() {
		return args;
	}
	
}
