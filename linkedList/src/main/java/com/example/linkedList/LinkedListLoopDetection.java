package com.example.linkedList;

import java.util.Optional;

import com.example.linkedList.LinkedList.Node;

public class LinkedListLoopDetection {

	public static void main(String[] args) {
		//1-2-3-4-2
		LinkedList list = new LinkedList();
		list = list.insertion(list);
		Optional<Integer> loopNode = isLoopExist(list);
		System.out.println("Loop Detected==== "+loopNode);
	}

	private static Optional<Integer> isLoopExist(LinkedList list) {
		Node slow = list.head;
		Node fast = list.head;
		while(fast!=null && fast.next!=null) {
			slow = slow.next;
			fast = fast.next.next;
			// Linked List has loop
			if(slow == fast) {
				break;
			}
		}
		
		// Incase of normal Linked List
		if(fast==null || fast.next==null) {
			return Optional.empty();
		}
		
		// If Linked List has loop
		slow = list.head;
		while(slow!=fast) {
			slow = slow.next;
			fast = fast.next;
		}
		
		return Optional.ofNullable(fast.data);
	}

}
