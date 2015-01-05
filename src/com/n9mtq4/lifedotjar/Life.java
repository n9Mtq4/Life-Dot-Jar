package com.n9mtq4.lifedotjar;

import com.n9mtq4.lifedotjar.utils.ArgParser;

import java.io.File;

/**
 * Created by Will on 1/5/15.
 */
public class Life extends Thread {
	
	private ArgParser argParser;
	
	private int generation;
	private File seed;
	
	public Life(ArgParser argParser) {
		this.argParser = argParser;
	}
	
	@Override
	public void run() {
		
//		Put stuff here
		
	}
	
	public ArgParser getArgParser() {
		return argParser;
	}
	
	public void setArgParser(ArgParser argParser) {
		this.argParser = argParser;
	}
	
}
