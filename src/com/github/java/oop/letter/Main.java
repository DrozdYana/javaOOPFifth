package com.github.java.oop.letter;

import java.io.File;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<>();
		File file=new File("text.txt");
		LetterFind letter=new LetterFind(list);
		letter.readText(file);
		letter.frequency(list);

	}

}
