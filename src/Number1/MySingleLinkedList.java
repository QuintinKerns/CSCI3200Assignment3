package Number1;

public class MySingleLinkedList<E> {
	private Node start;
	private int currentCount;
	public MySingleLinkedList()
	{
		start = null;
		currentCount = 0;
	}
	
	//My Swap
	public void swap(int index) {
        // Special Case: End if start.next is null or start is null
        if (start.next == null || start == null) return;
        
        // Special Case: Index is greater than or equal to currentCount
        if (index >= currentCount) return;
        
        // Special Case: 0 because 0th node has no previous node
        if (index == 0){
        	Node after = start.next;
    		Node last = start.next.next;
    		start.next = last;
    		after.next = start;
    		start = after;
    		return;
        }
        
        // Regular Case: Indices > 0
        // Cycle through to index
        Node prev = start, current, last; 
		for(int i = 0; i < index - 2; i++)
		{
			prev = prev.next;
		}
		// Set current and last values
		current = prev.next;
		last = current.next;
		
		// Swap values
		current.next = last.next;
		last.next = current;
		prev.next = last;
	}
	
	public void printList()
	{
		Node current = start;
		while(current != null)
		{
			System.out.println(current.value);
			current = current.next;
		}
	}
	
	public void add(E val)//O(N)
	{
		Node newItem = new Node(val);

		//if list is empty
		if(start == null)
		{
			start = newItem;
			currentCount++;
		}
		//if list has items
		else
		{
			Node current = start;//start at first item in list
			while(current.next != null)//move through list to last item
			{
				current = current.next;
			}
			//when while ends, current = last item in list
			current.next = newItem;
			currentCount++;
		}
	}
	public void insert(E val, int index)
	{
		if(index < 0)
		{
			index = 0;
		}
		if(index >= currentCount)//insert at end is same as add
		{
			this.add(val);
		}
		else
		{
			Node newItem = new Node(val);
			if(index == 0)//special case, changing start variable
			{
				newItem.next = start;//current list comes after new item
				start = newItem;//new item is first in list
			}
			else
			{
				Node current = start;
				for(int i = 1; i < index; i++)
				{
					current = current.next;
				}
				//System.out.println(current.value);

				//current == before at this point
				//before -> index -> after
				//1 -> 2 -> 3
				//goal
				//before -> new -> index -> after
				//1 -> new -> 2 -> 3
				newItem.next = current.next;//new -> index
				current.next = newItem;//before -> new
			}
			currentCount++;
		}
	}
	public void delete(int index)
	{
		if(index >= 0 && index < currentCount)
		{
			if(index==0)//deal with special case
			{
				start = start.next;
			}
			else
			{
				Node current = start;
				for(int i = 1; i < index; i++)//find item before the one being deleted
				{
					current = current.next;
				}
				current.next = current.next.next;
				//current -> deleteMe -> restoflist
				//current -> restoflist
			}
			currentCount--;
		}
	}
	public E get(int index)//O(N)
	{
		if(index >= 0 && index < currentCount)
		{
			Node current = start;
			for(int i = 0; i < index; i++)
			{
				current = current.next;
			}
			//current = node at the index
			return current.value;
		}
		else
		{
			return null;
		}
	}

	private class Node
	{
		E value;
		Node next;
		public Node(E v)
		{
			value = v;
			next = null;//no node after this one
		}
	}
}
