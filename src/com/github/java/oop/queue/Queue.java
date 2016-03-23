package com.github.java.oop.queue;

import java.util.*;

public class Queue {
	private ArrayDeque<Person> queueCola = new ArrayDeque<>();

	public Queue(ArrayDeque<Person> queueCola) {
		super();
		this.queueCola = queueCola;
	}

	public ArrayDeque<Person> getQueueCola() {
		return queueCola;
	}

	public void setQueueCola(ArrayDeque<Person> queueCola) {
		this.queueCola = queueCola;
	}

	public ArrayDeque<Person> generateQueue(int countCup) {
		for (int i = 0; i < countCup; i++) {
			this.queueCola.add(this.queueCola.peekFirst());
			this.queueCola.add(this.queueCola.peekFirst());
			this.queueCola.pollFirst();			
		}
		System.out.println(this.queueCola);
		return this.queueCola;
	}

}
