package com.example.linkedList;

import com.example.linkedList.LinkedList.Node;

public class LinkedList {
	Node head;

	class Node {

		int data;
		Node next;

		Node(int d) {
			this.data = d;
		}

	}

	// Insertion in head 4 ->3 ->2 ->1 -> null
	public LinkedList insertAtHead(LinkedList list, int data) {
	   // 1->2->3->null
	   // 5
		Node new_Node = new Node(data);//5
		new_Node.next = list.head;//5->1
		list.head = new_Node;//5->1->2->3->null
		return list;
	}
	
	
	// Insertion in Tail 1 -> 2 -> 3 -> 4 -> null
	public LinkedList insertAtTail(LinkedList list, int data) {
	// create a node,insert a data into the node and next to null
		Node new_Node = new Node(data);
		new_Node.next = null;
	
		// if head is null point head to new node
		if(head == null) {
			list.head = new_Node;
		}else {
			Node last = list.head;
			while(last.next!=null) {
				last = last.next;//4
			}
			
			last.next = new_Node; //1->2->3->4->null
		}
		
		return list;
	}
	
	
	// Insertion in Tail 1 -> 2 -> 3 -> 4 -> null
		public LinkedList insertionAtTail(LinkedList list, Node new_Node) {
		// create a node,insert a data into the node and next to null
//			Node new_Node = new Node(data);
//			new_Node.next = null;
		
			// if head is null point head to new node
			if(head == null) {
				list.head = new_Node;
			}else {
				Node last = list.head;
				while(last.next!=null) {
					last = last.next;//4
				}
				
				last.next = new_Node; //1->2->3->4->null
			}
			
			return list;
		}
	
	public LinkedList deleteNode(LinkedList list, int key) {
		
		Node temp = list.head;
		Node prev = null;
		
		if(temp!=null && temp.data == key) {
			list.head = temp.next;
		}
		
		while(temp!=null && temp.data!=key) {
			prev = temp;
			temp = temp.next;
		}
		
		if(temp.next == null) {
			return list;
		}
		
		prev.next = temp.next;
		
		return list;
	}
	
	public LinkedList deleteNodeAtPosition(LinkedList list, int pos) {
		Node temp = list.head;
		Node prev = null;
		
		if(temp!=null && pos == 0) {
			list.head = temp.next;
		}
		
		for(int i=0;temp!=null && i<pos;i++) {
			prev = temp;
			temp = temp.next;
		}
		prev.next = temp.next;
		return list;	
	}
	
	public LinkedList getMiddleElement(LinkedList list) {
		Node slow = list.head;
		Node fast = list.head;
		
		//even fast!=null && odd = fast.next!=null
		
		// even 1->2->3->4->5->6->null
		// odd 1->2->3->4->5->null
		
		while(fast!=null && fast.next!=null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		
		System.out.println("--------slow---------"+slow.data);
		
		return list;
	}
	

	public void printElements(LinkedList list) {
		System.out.println();

		Node curr_Node = list.head;
		while (curr_Node != null) {
			System.out.print(curr_Node.data+"->");
			curr_Node = curr_Node.next;
		}
//		System.out.print("null");
		System.out.println();

	}
	
	
	public void print(LinkedList list) {
		System.out.println();

		Node curr_Node = list.head;
		while (curr_Node != null) {
			System.out.print(curr_Node.data+" ");
			curr_Node = curr_Node.next;
		}
		System.out.println();

	}

	public static void main(String args[]) {
		LinkedList list = new LinkedList();

//		list.insertAtHead(list, 1);
//		list.insertAtHead(list, 2);
//		list.insertAtHead(list, 3);
//		list.insertAtHead(list, 4);
		
		list.insertAtTail(list, 1);
		list.insertAtTail(list, 2);
		list.insertAtTail(list, 3);
		list.insertAtTail(list, 4);
		
		list.printElements(list);
//		list.deleteNode(list, 3);
//		list.deleteNodeAtPosition(list, 2);
		list.getMiddleElement(list);
		
//		System.out.println("After Deleting the node================");
//		list.printElements(list);

	}
	
	public LinkedList insertion(LinkedList list) {
		// 1->2->3->4->2
		Node loop = new Node(2);
		list.insertionAtTail(list, new Node(1));
		list.insertionAtTail(list, loop);
		list.insertionAtTail(list, new Node(3));
		list.insertionAtTail(list, new Node(4));
		list.print(list);
		list.insertionAtTail(list, new Node(5));
		
		return list;
	}


	

}

