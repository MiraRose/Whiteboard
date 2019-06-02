package com.mirandaregan;

import java.util.HashMap;
import java.util.Map;

public class BasicLetters implements Alphabet {
	
	private Map<String, String> lines = new HashMap<String, String>();
	
	private void makeLines() {
		lines.put("midTwo", "  ==  ");
		lines.put("twoSideTwos", "==  ==");
		lines.put("lineAcross", "======");
		lines.put("fourLeft", "====  ");
		lines.put("twoLeft", "==    ");
		
	}
	
	private Map<String, String[]> alphabet = new HashMap<String, String[]>();
	
	private void makeAlphabet() {
		
		alphabet.put("a", new String[] {lines.get("midTwo"), lines.get("twoSideTwos"), 
				lines.get("lineAcross"), lines.get("twoSideTwos"), lines.get("twoSideTwos")});
		alphabet.put("b", new String[] {lines.get("fourLeft"), lines.get("twoSideTwos"), 
				lines.get("lineAcross"), lines.get("twoSideTwos"), lines.get("fourLeft")});
		alphabet.put("c", new String[] {lines.get("lineAcross"), lines.get("twoLeft"), 
				lines.get("twoLeft"), lines.get("twoLeft"), lines.get("lineAcross")});
		alphabet.put("d", new String[] {lines.get("twoRight"), lines.get("lineAross"), 
				lines.get("twoSideTwos"), lines.get("twoSideTwos"), lines.get("lineAcross")});
		
		
		
	}
	

	@Override
	public String getLetterLine(String letter, int line) {
		
		String[] wantedLetter = alphabet.get(letter);
		String wantedLine = wantedLetter[line];
		
		return wantedLine;
	}

}
