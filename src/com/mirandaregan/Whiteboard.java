package com.mirandaregan;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Whiteboard implements CanDraw {

	
	public void draw(String word) {
		String wordArray[] = word.split("");
		
		char[] alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
		Map<String, String> listOfLetters = new HashMap<String, String>();
		
		for (char character : alphabet) {
			String letter = Character.toString(character);
			listOfLetters.put(letter, "This will be an ASCII " + letter);
		}
		
		for (String letter : wordArray) {
			
			System.out.println(listOfLetters.get(letter));
			
		}
		
		
//		==
//	  ==  ==
//	  ======
//	  ==  ==
//	  ==  ==
	}

	@Override
	public String erase() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean clean() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String pin() {
		// TODO Auto-generated method stub
		return null;
	}

}
