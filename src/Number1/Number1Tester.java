package Number1;

public class Number1Tester {

	public static void main(String[] args) {
		
		MySingleLinkedList singleList = new MySingleLinkedList();
		for (int i = 0; i < 12; i++) {
			singleList.add(i);
		}
		System.out.println("Single List:");
		singleList.printList();
		singleList.swap(0);
		System.out.println("Single List Swap 0:");
		singleList.printList();
//		System.out.println("Single List Swap 10:");
//		singleList.swap(10);
//		singleList.printList();
		
//		MyDoubleLinkedList doubleList = new MyDoubleLinkedList();
//		for (int i = 0; i < 12; i++) {
//			doubleList.add(i);
//		}
//		System.out.println("Double List:");
//		doubleList.printList();
//		doubleList.swap(0);
//		System.out.println("Double List Swap 0:");
//		doubleList.printList();
//		System.out.println("Double List Swap 10:");
//		doubleList.swap(10);
//		doubleList.printList();
	}

}
