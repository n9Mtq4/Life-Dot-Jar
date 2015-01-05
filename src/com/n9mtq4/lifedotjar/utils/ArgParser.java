/*
 * NOTE: This is added by intellij IDE. Disregard this copyright if there is another copyright later in the file.
 * Copyright (C) 2015  Will Bresnahan, Jake Kinsella, and Jacob Beckley
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

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
