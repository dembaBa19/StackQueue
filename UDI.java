package StackQueue;

import java.util.*;

public class UDI {

	public static void main(String[] args) {
		PriorityQueue<String> q1 = new PriorityQueue<String>();
		PriorityQueue<String> q2 = new PriorityQueue<String>();
		q1.offer("George");
		q1.offer("Jim");
		q1.offer("John");
		q1.offer("Blake");
		q1.offer("Kevin");
		q1.offer("Michael");
		q2.offer("George");
		q2.offer("Katie");
		q2.offer("Kevin");
		q2.offer("Michelle");
		q2.offer("Ryan");
		System.out.println(q1 + "\n" + q2);
		PriorityQueue<String> union = new PriorityQueue<> (q1);
		union.addAll(q2);
		
		PriorityQueue<String> intersection = new PriorityQueue<> (q1);
		intersection.retainAll(q2);
		
		PriorityQueue<String> difference = new PriorityQueue<> (union);
		difference.removeAll(intersection);
		
		System.out.println("Union of sets: " + union);
		System.out.println("Difference of sets: " + difference);
		System.out.println("Intersection of sets: " + intersection);
	}

}