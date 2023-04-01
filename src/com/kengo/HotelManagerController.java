package com.kengo;

import java.util.Scanner;

public class HotelManagerController {

	public void options() {
		System.out.println("Please type to select the following options:");
		System.out.println("Guest Check in:\t\t\tType 1");
		System.out.println("Guest Check out:\t\tType 2");
		System.out.println("All Rooms Occupancy Status:\tType 3");
		System.out.println();


		System.out.print("Option : ");
		try{
			Scanner input = new Scanner(System.in);
			
			String selectedOption = input.next();
			
			if(selectedOption.equals("1")) {
				System.out.println("option 1");
			}else if(selectedOption.equals("2")) {
				System.out.println("option 2");
			}else if(selectedOption.equals("3")) {
				System.out.println("option 3");
			}else {
				System.out.println("Please type a valid option number.");
				System.out.println();
				options();
			}
			
		}catch(Exception e) {
			System.out.println("An error has occured, please try again.");
			options();
		}
		
		



		


	}
}
