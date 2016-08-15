package com.project;

import java.io.*;
import java.nio.file.*;

public class CountriesWriteRead {
	Path addACountry = Paths.get("\\Users\\admin\\workspace\\newWorkspace\\WEEK3DAY1\\src\\com\\project\\lilstedCountries.txt");
	File ourNewFile = addACountry.toFile();
	
	public void addCountryMethod(String userCountryInput) {

	try (PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(ourNewFile, true)))) {
		out.println(userCountryInput);
	} catch (IOException e) {
		e.printStackTrace();
	}
		System.out.println(userCountryInput + " has been added to the list. \n\n");
	}
		
	
	public void listCountriesMethod() {
		 
		
		try (BufferedReader in = new BufferedReader(new FileReader(ourNewFile))) {
			String lilstedCountries;
						
			while ((lilstedCountries = in.readLine()) != null) {
				System.out.println(lilstedCountries + "\n\n");
			}
			
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	
	}
}
