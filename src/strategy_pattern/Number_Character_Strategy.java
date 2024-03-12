package strategy_pattern;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Number_Character_Strategy implements CryptoStrategy {
	String[][] numbers_character = new String[26][2];

	@Override
	public String encrypt(String s) throws FileNotFoundException {
	    getData();
	    StringBuilder verschluesselt = new StringBuilder();
	    char[] buffer = s.toCharArray();
	    for (char c : buffer) {
	        for (String[] z : numbers_character) {
	            if (z[0].charAt(0) == c) {
	                verschluesselt.append(z[1] + " ");
	                break; 
	            }
	        }
	    }
	    return verschluesselt.toString();
	}



	@Override
	public String decrypt(String s) {
	    StringBuilder entschluesselt = new StringBuilder();
	    String[] numbers = s.split(" ");
	    for (String number : numbers) {
	        for (String[] z : numbers_character) {
	            if (z[1].equals(number)) { 
	                entschluesselt.append(z[0]);
	                break;
	            }
	        }
	    }
	    return entschluesselt.toString();
	}

	
	private void getData() throws FileNotFoundException {
	    Scanner scanner = new Scanner(new File("C:\\Users\\Raffl Manuel\\OneDrive - HTL Anichstrasse\\HTL\\4AHWII\\SWP\\Java\\Java_Abgaben_4AHWII\\src\\strategy_pattern\\numbers_character.txt"));
	    int character_position = 0;
	    while (scanner.hasNext() && character_position < 26) {
	        String line = scanner.nextLine();
	        String[] num_char = line.split(":");
	        numbers_character[character_position][0] = num_char[0];
	        numbers_character[character_position][1] = num_char[1];
	        character_position++;
	    }
	    scanner.close();
	}



}
