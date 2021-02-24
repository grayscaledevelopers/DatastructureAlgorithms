package com.example.Stack;

import java.util.EmptyStackException;

public class Stack {

	Node top;

	class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
		}
	}

	// push the data into the Stack
	public Stack push(Stack stack, int data) {
		// create a new node with the input data
		// insertion at Head
		// 1->null,top = 1
		// 2
		Node new_Node = new Node(data);// 2
		new_Node.next = top;// 2->1->null
		top = new_Node;// 2->1->null
		return stack;
	}

	public void print(Stack stack) {
		Node curr = stack.top;
		while (curr != null) {
			System.out.println("Elements in the Stack " + curr.data);
			curr = curr.next;
		}
	}

	public boolean isEmpty(Stack stack) {
		if (stack.top == null) {
			return true;
		}
		return false;
	}

	public int peek(Stack stack) {
		if (isEmpty(stack)) {
			throw new EmptyStackException();
		}

		int data = stack.top.data;
		return data;
	}

	public int pop(Stack stack) {
		if (isEmpty(stack)) {
			throw new EmptyStackException();
		}
		
		int data = stack.top.data;
		top = top.next;
		return data;
	}

	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.push(stack, 1);
		stack.push(stack, 2);
		stack.push(stack, 3);
		stack.push(stack, 4);
		stack.print(stack);
		int peek = stack.peek(stack);
		System.out.println("=========peek data============= "+peek);
		stack.pop(stack);
		stack.print(stack);
	}

}
