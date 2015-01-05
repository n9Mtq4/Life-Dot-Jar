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
