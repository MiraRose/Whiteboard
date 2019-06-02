package com.mirandaregan;

import java.util.Scanner;



public class WhiteboardTest {

	public static void main(String[] args) {
		
//		Scanner in = new Scanner(System.in);
//		
//		System.out.println("Give me a word to draw: ");
//		String word = in.nextLine();
//		
//		new Whiteboard().draw(word);
		
		BasicLetters basicLetters = new BasicLetters();
		
		System.out.println(basicLetters.getLetterLine("a", 1));

	}

}
