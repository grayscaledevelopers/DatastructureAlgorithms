package com.example.Stack;
import java.util.Stack;

public class QueueWithStack {
	
	Stack<Integer> oldStack;
	Stack<Integer> newStack;
	
	QueueWithStack(){
		oldStack = new Stack<Integer>();
		newStack = new Stack<Integer>();
	}
	
	public int size() {
		return oldStack.size() + newStack.size();
	}
	
	public void enqueue(int data) {
		//3 2 1
		newStack.push(data);
	}
	
	public void shiftStack() {
		if(oldStack.isEmpty()) {
			while(!newStack.isEmpty()) {
				oldStack.push(newStack.pop()); 
			}
		}
	}
	
	public int dequeue() {
		shiftStack();
		int val = oldStack.pop();
		return val;
	}
	
	public int peek() {
		shiftStack();
		int val = oldStack.peek();
		return val;
	}
	
	public boolean isQueueEmpty() {
		if(size() == 0) return true;
		return false;
	}
	
	public static void main(String args[]) {
		QueueWithStack queue = new QueueWithStack();
		queue.enqueue(1);
		System.out.println(" Is Empty "+queue.isQueueEmpty());
	}
	
	 
}
