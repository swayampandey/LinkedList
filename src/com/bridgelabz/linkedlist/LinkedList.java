package com.bridgelabz.linkedlist;

public class LinkedList<T> {
	Node<T> head;
	Node<T> tail;
	
	public void insert(T data) {
		Node<T> node = new Node<>(data);
		if(head == null) {
			head = node;
			tail = node;
		}
		else {
			node.next = head;
			head = node;
		}
	}
	
	public void append(T data) {
		Node<T> node = new Node<>(data);
		if(head == null) {
			head = node;
			tail = node;
		}
		else {
			tail.next =node;
			tail = node;
		}
	}
	
	public void display() {
		Node<T> temp = head;
		while(temp != null) {
			System.out.println(temp.data+ "");
			temp = temp.next;
		}	
	}

}
