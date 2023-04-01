package com.kengo;

import java.util.Scanner;

public class HotelManagerController {

	//initial data
	private int [] GuestOccupancy = {2,0,1,3,3,4,6,2,0,3};
	
	Scanner input = new Scanner(System.in);

	public void options() {
		System.out.println("Welcome to Hotel Manager App. Please type to select the following options:");
		System.out.println("Guest Check in:\t\t\tType 1");
		System.out.println("Guest Check out:\t\tType 2");
		System.out.println("Current Occupancy Status:\tType 3");
		System.out.println("Quit\t\t\t\tType 4");
		System.out.println();


		System.out.print("Option : ");
		try{
			String selectedOption = input.next();

			if(selectedOption.equals("1")) {
				System.out.println();
				checkIn();
			}else if(selectedOption.equals("2")) {
				System.out.println();
				checkOut();
			}else if(selectedOption.equals("3")) {
				System.out.println();
				occupancyStatus();
			}else if(selectedOption.equals("4")) {
				System.out.println("Goodbye");
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
	
	private void checkIn() {
		System.out.println("= Check in=");
		System.out.println();
		
		
		try {
			System.out.println("How many guests would you like to add?");
			System.out.print("Guests : ");
			String guestNumber = input.next();
			
			System.out.println("Which room would you like to check them in to?");
			System.out.print("Room : ");
			String roomNumber = input.next();
			
			int i = Integer.parseInt(roomNumber) - 1;
			
			if(GuestOccupancy[i] == 0) {
				GuestOccupancy[i] = Integer.parseInt(guestNumber);
				System.out.println("Successfully checked in " + guestNumber + " guests into Room " 
				+ roomNumber + ".");
			}else System.out.println("Error - This room is occupied");
			
			Thread.sleep(1000);
			
			System.out.println();
			anotherOption();
		}catch(Exception e) {
			System.out.println("An error has occured, please try again.");
			options();
		}
		
		
	}
	
	private void checkOut() {
		System.out.println("= Check out =");
		System.out.println();
		
		System.out.println("Which Room would you like to check out?");
		System.out.print("Room : ");
		try {
			String selectedRoom = input.next();
			
			int i = Integer.parseInt(selectedRoom) - 1;
			
			System.out.println();
			if(GuestOccupancy[i] != 0) {
				GuestOccupancy[i] = 0;
				System.out.println("Check out for Room " + selectedRoom + " successful.");
			}else System.out.println("Error - The room is already Vacant.");
			
			Thread.sleep(1000);
			
			System.out.println();
			anotherOption();
			
		}catch(Exception e) {
			System.out.println("An error has occured, please try again.");
			options();
		}
		
	}

	private void occupancyStatus() {
		System.out.println("= Current Occupancy status =");
		System.out.println();

		System.out.println("Room\tGuests");
		System.out.println("------------------");
		for(int i = 0; i < GuestOccupancy.length; i++) {
			System.out.print(i+1 + "\t");
			if(GuestOccupancy[i] == 0) {
				System.out.println("Vacant");
			}else System.out.println(GuestOccupancy[i]);
		}

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println();
		anotherOption();

	}

	private void anotherOption() {
		System.out.print("Choose another option? Type y/n: ");
		try {
			String selectedOption = input.next();

			if(selectedOption.equals("y")) {
				System.out.println();
				options();
			}else if(selectedOption.equals("n")){
				System.out.println("Goodbye");
			}else {
				System.out.println("Please type a valid option.");
				System.out.println();
				anotherOption();
			}
		}catch(Exception e) {
			System.out.println("An error has occured, please try again.");
			anotherOption();
		}
	}

}
