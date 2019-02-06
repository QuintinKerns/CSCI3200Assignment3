package Number5;

import java.util.ArrayList;

public class MyQueue<E> {
	ArrayList<E> queue;
	int length;
	public MyQueue(){
		queue = new ArrayList<E>();
	}
	
	public void enqueue(E item){
		queue.add(item); // Adds item at 0
		length++;
	}
	
	// Returns null if length is 0
	public E dequeue(){
		if (length > 1){
			length--;
			return queue.remove(length); // Removes last item from queue and returns it
		}
		else if (length == 1){
			length--;
			return queue.remove(0);
		}
		else return null;
	}
	
	// Returns null if length is 0
	public E peek(){
		if (length > 0) return queue.get(0); // Gets queue item at index 0
		else return null;
	}
	
	public void printQueue(){
		System.out.println(queue);
	}
	
	public String toString(){
		return queue.toString();
	}
}
