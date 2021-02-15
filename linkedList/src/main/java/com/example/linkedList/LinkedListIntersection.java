package com.example.linkedList;

import java.util.HashSet;

import com.example.linkedList.LinkedList.Node;


public class LinkedListIntersection {
		
		public static void main(String args[]) {
			//  List 1
			LinkedList list1 = new LinkedList();
			list1.insertAtTail(list1, 1);
			list1.insertAtTail(list1, 2);
			list1.insertAtTail(list1, 3);
			list1.insertAtTail(list1, 4);
			list1.insertAtTail(list1, 5);
			list1.printElements(list1);
			// List 2
			LinkedList list2 = new LinkedList();
			list2.insertAtTail(list2, 7);
			list2.insertAtTail(list2, 3);
			list2.insertAtTail(list2, 4);
			list2.insertAtTail(list2, 5);
			list1.printElements(list2);
			Node intersectNode = intersectingNode(list1,list2);
			System.out.println("Intersecting Point "+intersectNode.data);
		
		}
		
		
		public static Node intersectingNode(LinkedList list1,LinkedList list2) {
			Node n1 = list1.head;
			Node n2 = list2.head;
			HashSet<Integer> hs = new HashSet();
			
			while(n1!=null) {
				hs.add(n1.data);
				n1 = n1.next;
			}
			
			while(n2!=null) {
				if(hs.contains(n2.data)) {
					return n2;
				}
				n2 = n2.next;
			}	
		
			return null;
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	


}
