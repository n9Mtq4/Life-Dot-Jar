package com.n9mtq4.lifedotjar;

import com.n9mtq4.lifedotjar.utils.ArgParser;

/**
 * Created by Will on 1/5/15.
 */
@SuppressWarnings("unused")
public class LifeDotJar {
	
//	TODO: expand help
	private static String[] helpMSG = {"Life Dot Jar version 0.0.1"};
	
	public static void main(String[] args) {
		
		ArgParser a = new ArgParser(args);
		if (a.containsIgnoreCase("--help")) {
			printHelp();
			return;
		}
		if (a.containsIgnoreCase("--nogui")) {
			new Life(a);
			return;
		}
		new LifeGui(a);
		
	}
	
	private static void printHelp() {
		for (String s : helpMSG) {
			System.out.println(s);
		}
	}
	
}
