package com.project;

import com.project.CountriesWriteRead;
import java.io.*;
import java.nio.file.*;
import java.util.Scanner;


public class Countries {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean listCountries = true;
		CountriesWriteRead cwr =new CountriesWriteRead();
		
		System.out.println("Countries of the World: \n United States of America \n United Kingdom \n Canada \n Mexico \n France \n\n"
				+ "What would you like to do next? \n (1) Add a country to the list \n (2) Display the list \n (3) Exit the list");
				
		do {	String userInput = sc.nextLine();	
			switch (userInput.toLowerCase()) {
				case "1":
					System.out.println("Please enter a new country to add to the list.");
					String userCountryInput = sc.nextLine();
					cwr.addCountryMethod(userCountryInput);
					break;
					
				case "2":
					System.out.println("List of Countries \n");
					cwr.listCountriesMethod();
					break;
					
				case "3":
					CountriesValidator.listCountries(userInput);
					break;
					
				default:
					System.out.println("You have made an invalid choice.  Please enter '1', '2', or '3' to exit.");
					break;	
				} 
					System.out.println("What would you like to do next? \n (1) Add a country to the list \n (2) Display the list \n (3) Exit the list");
			}while (listCountries = true);
				
	}
}
