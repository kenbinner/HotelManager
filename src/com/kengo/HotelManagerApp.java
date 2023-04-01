package com.kengo;

public class HotelManagerApp {

	public static void main(String[] args) {
		init();
		
		HotelManagerController app = new HotelManagerController();
		app.options();
	}
	
	public static void init() {
		System.out.println("=====================");
		System.out.println("= Hotel Manager App =");
		System.out.println("=====================");
		System.out.println();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
