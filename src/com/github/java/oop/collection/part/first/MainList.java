package com.github.java.oop.collection.part.first;

import java.util.ArrayList;
import java.util.Random;

public class MainList {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		Random rn = new Random();
		for (int i = 0; i < 10; i++) {

			list.add(rn.nextInt(10));

		}
		System.out.println("Begin array:" +list);
		List<Integer> array = new List<>(list);
		array.removeListElements();

	}

}
