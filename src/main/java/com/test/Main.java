package com.test;

import com.crawler.Spider;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Spider s = new Spider();
		s.readNewData("/home/luiggi/Escritorio/fallas/Fallas/apertura2012.html");
	}

}
