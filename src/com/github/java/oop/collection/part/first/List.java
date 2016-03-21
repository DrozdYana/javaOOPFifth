package com.github.java.oop.collection.part.first;

import java.util.ArrayList;

public class List<T> {
	private ArrayList<T> list;

	public List(ArrayList<T> list) {
		super();
		this.list = list;
	}

	public ArrayList<T> getList() {
		return list;
	}

	public void setList(ArrayList<T> list) {
		this.list = list;
	}

	public void removeListElements() {
		System.out.println("Class array:" +this.list);
		this.list.remove(0);
		this.list.remove(0);
		this.list.remove(this.list.size() - 1);
		System.out.println("End array:" +this.list);

	}
}
