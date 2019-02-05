package Number5;

public class QueueTester {
	
	public static void main(String[] args){
		MyQueue<Integer> queue = new MyQueue<Integer>();
		
		for (int i = 0; i < 2; i++){
			queue.enqueue(i);
		}
		
		System.out.println("Queue: " + queue.toString());
		System.out.println("Front: " + queue.front);
		System.out.println("End: " + queue.end);
		System.out.println("Length: " + queue.length);
		System.out.println("Dequeue: " + queue.dequeue());
		System.out.println("Queue: " + queue.toString());
		System.out.println("Front: " + queue.front);
		System.out.println("End: " + queue.end);
		System.out.println("Length: " + queue.length);
		System.out.println("Dequeue: " + queue.dequeue());
		System.out.println("Queue: " + queue.toString());
		System.out.println("Peek: " + queue.peek());
	}
}
