package com.dakao.jenkins;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

	private static final Logger logger = LoggerFactory
			.getLogger(HomeController.class);

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			logger.debug("########## " + i + " step ##########");
			sleep(20);
		}
	}

	public static void sleep(int sec) {
		try {
			Thread.sleep(sec * 1000);
		} catch (InterruptedException e) {
		}
	}
}
