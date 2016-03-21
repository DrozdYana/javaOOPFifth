package com.github.java.oop.letter;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.TreeSet;

public class LetterFind {
	private ArrayList<String> list = new ArrayList<>();
	private TreeSet<Text> textSet = new TreeSet<>();

	public LetterFind(ArrayList<String> list) {
		super();
		this.list = list;
	}

	public ArrayList<String> getList() {
		return list;
	}

	public void setList(ArrayList<String> list) {
		this.list = list;
	}

	public void readText(File file) {
		try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
			if (!file.exists() || !file.isFile()) {
				throw new IllegalArgumentException("FILE DOESN'T EXIST!!!");
			} else {
				String temp;
				String[] result = null;
				for (; (temp = reader.readLine()) != null;) {
					result = temp.split("[^a-zA-Z]+");

				}
				for (int i = 0; i < result.length; i++) {
					list.add(result[i]);
				}

			}
		} catch (IOException ex) {
			System.out.println(ex);
		}
	}

	public void frequency(ArrayList<String> list) {
		ArrayList<String> symbol = new ArrayList<>();

		for (String str : list) {

			for (int i = 1; i <= str.length(); i++) {
				symbol.add(str.substring(i - 1, i).toUpperCase());
			}
		}
		for (String input : symbol) {
			int count = 0;
			for (String check : symbol) {

				if (input.equals(check)) {
					++count;

				}

			}
			// put results in set
			double cnt = (double) count / (double) symbol.size();
			textSet.add(new Text(input, cnt));

		}

		System.out.println(textSet);

	}
}
