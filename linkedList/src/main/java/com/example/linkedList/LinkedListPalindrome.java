package com.example.linkedList;

import java.util.Stack;

import com.example.linkedList.LinkedList.Node;

public class LinkedListPalindrome {
	
	public static void main(String args[]) {
		//  List 1
		LinkedList list = new LinkedList();
		list.insertAtTail(list, 3);
		list.insertAtTail(list, 4);
		list.insertAtTail(list, 4);
		list.insertAtTail(list, 3);
		list.printElements(list);
        boolean res = checkPalindrome(list);
        System.out.println("Is Palindrome or not "+res);
	}

	private static boolean checkPalindrome(LinkedList list) {
		Node slow = list.head;
		Node fast = list.head;
		Stack<Integer> s = new Stack();
		
		// Elements till mid point
		while(fast!=null && fast.next!=null) {
			s.push(slow.data);
			slow = slow.next;
			fast = fast.next.next;
		}
		
		//if it is odd
		if(fast!=null) {
			slow = slow.next;
		}
		
		//Traverse Remaining Elements
		while(slow!=null) {
			int top = s.pop().intValue();
			if(top!=slow.data) {
				return false;
			}
			slow = slow.next;
		}
		return true;
	}

}
