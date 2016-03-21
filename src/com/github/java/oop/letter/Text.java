package com.github.java.oop.letter;

import java.util.ArrayList;

public class Text implements Comparable<Text> {
	private String letter;
	private Double frequency;
	private static ArrayList<String> field = new ArrayList<>();

	public Text(String letter, Double frequency) {
		super();
		this.letter = letter;
		this.frequency = frequency;
	}

	public String getLetter() {
		return letter;
	}

	public Double getFrequency() {
		return frequency;
	}

	public void setLetter(String letter) {
		this.letter = letter;
	}

	public void setFrequency(Double frequency) {
		this.frequency = frequency;
	}

	@Override
	public int compareTo(Text text) {
		field.add(text.letter);
		if (!field.contains(this.letter) && this.frequency <= text.getFrequency()) {
			return 1;
		} else if (!field.contains(this.letter) && this.frequency > text.getFrequency()) {
			return -1;
		} else
			return 0;
	}

	@Override
	public String toString() {
		return "letter=" + letter + " frequency=" + String.format("%2.02f", frequency);
	}

}
