package com.example.linkedList;

import java.util.HashSet;

import com.example.linkedList.LinkedList.Node;

public class LinkedListDuplicatesRemoval {
	public static void main(String args[]) {
		//  List 1
		LinkedList list1 = new LinkedList();
		list1.insertAtTail(list1, 1);
		list1.insertAtTail(list1, 2);
		list1.insertAtTail(list1, 1);
		list1.insertAtTail(list1, 4);
		list1.insertAtTail(list1, 5);
		list1.printElements(list1);
		removeDups(list1);
		System.out.print("After Removal:");
		list1.printElements(list1);
	
	}
	
	
	public static LinkedList removeDups(LinkedList list) {
		Node curr_Node = list.head;
		Node prev = null;
		HashSet<Integer> hs = new HashSet();
		while(curr_Node!=null) {
			if(hs.contains(curr_Node.data)) {
				prev.next = curr_Node.next;
			}else {
				prev = curr_Node;
				hs.add(curr_Node.data);
				
			}
			
			curr_Node = curr_Node.next;
			
			
			
		}
		
		return list;
		
	}

}
