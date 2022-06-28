package com.training.collections;

import java.util.PriorityQueue;

public class DemoPriorityQueue {

	public static void main(String[] args) {
		PriorityQueue<Integer> queue =new PriorityQueue<Integer>();
		
		queue.add(7);
		queue.add(77);
		queue.add(777);
		queue.add(7787);
		
		System.out.println("element in the head"+queue.peek());
		//System.out.println(queue.remove());
	for (Integer i : queue) {
		System.out.println(i);
		
	}
	}
}
