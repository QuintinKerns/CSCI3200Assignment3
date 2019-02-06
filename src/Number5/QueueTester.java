package Number5;

public class QueueTester {
	
	public static void main(String[] args){
		MyQueue<Integer> queue = new MyQueue<Integer>();
		
		// Fill Queue and Test Enqueue
		for (int i = 0; i < 10; i++){
			queue.enqueue(i);
		}
		
		// Testing Code
		System.out.println("Queue: " + queue.toString());
		System.out.println("Length: " + queue.length);
		System.out.println("Dequeue: " + queue.dequeue());
		System.out.println("Queue: " + queue.toString());
		System.out.println("Length: " + queue.length);
		System.out.println("Dequeue: " + queue.dequeue());
		System.out.println("Queue: " + queue.toString());
		System.out.println("Peek: " + queue.peek());
	}
}
