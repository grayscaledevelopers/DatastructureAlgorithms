package queue;

import java.util.NoSuchElementException;

class Queue {
	
	static Node first;
	static Node last;
	
	public class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
		}
	}
	
	
	public Queue enqueue(Queue queue,int data) {
		// 1->2
		Node new_Node = new Node(data);
		if(last!=null) {
			last.next = new_Node;
		}
		last = new_Node;
		if(first==null) {
			first = last;
		}
		return queue;
	}
	
	public void print(Queue queue) {
		Node curr = queue.first;
		while(curr!=null) {
			System.out.println("Elements in Queue== "+curr.data);
			curr = curr.next;
		}
	}
	
	public static boolean isEmpty(Queue queue) {
		if(queue.first==null) { return true; }
		return false;
	}
	
	public static int peek(Queue queue) {
		if(isEmpty(queue)) { throw new NoSuchElementException();}
		 
		int peek = queue.first.data;
		return peek;
	}
	
	public static void dequeue(Queue queue) {
		if(isEmpty(queue)) { throw new NoSuchElementException();}
		 
		queue.first = queue.first.next;
		if(first==null) {
			last=null;
		}
	}

   public static void main(String args[]) {
	   Queue queue = new Queue();
	   queue.enqueue(queue, 1);
	   queue.enqueue(queue, 2);
	   queue.enqueue(queue, 3);
	   queue.enqueue(queue, 4);
	   queue.print(queue);
	   int peekData = peek(queue);
	   System.out.println("Peek Data === "+peekData);
	   queue.dequeue(queue);
	   queue.print(queue);
	   
   }
}


