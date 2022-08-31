package com.bridgelabz.linkedlist;

public class LinkedListMain {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		
		list.insert(70);
	    list.insert(30);
	    list.insert(56);
		list.display();
	    System.out.println();
		
		LinkedList<Integer> list1 = new LinkedList<>();
		list1.append(56);
		list1.append(30);
		list1.append(70);
		list1.display();
	}

}
