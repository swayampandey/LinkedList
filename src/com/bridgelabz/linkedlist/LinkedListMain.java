package com.bridgelabz.linkedlist;

public class LinkedListMain {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		Node<Integer> node = new Node<>(56);
		list.head = node;
		Node<Integer> node1 = new Node<>(30);
		list.head = node1;
		Node<Integer> node2 = new Node<>(70);
		list.head = node2;
		list.display();
	}

}
