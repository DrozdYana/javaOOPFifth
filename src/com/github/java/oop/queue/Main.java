package com.github.java.oop.queue;

import java.util.ArrayDeque;

public class Main {

	public static void main(String[] args) {
		Person p1=new Person("Sheldon");
		Person p2=new Person("Leonard");
		Person p3=new Person("Volovitz");
		Person p4=new Person("Kutrapalli");
		Person p5=new Person("Penni");
		ArrayDeque<Person> queue=new ArrayDeque<>();
		queue.add(p1);
		queue.add(p2);
		queue.add(p3);
		queue.add(p4);
		queue.add(p5);
		Queue colaQueue=new Queue(queue);
		colaQueue.generateQueue(2);
	}

}
