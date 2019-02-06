package Number2;

public class PotatoList<Integer> {
	private Node start;
	int currentCount;
	public PotatoList(int people)
	{
		start = null;
		currentCount = 0;
		for (int i = 0; i < people; i++) {
			this.add(i);
		}
		// Links last to first
		this.get(currentCount - 1).next = start;
	}
	
	void pass(int moves) {
		this.delete(moves); // Delete at index moves
		this.get(moves - 1).next = this.get(moves);
		this.linkLast();
		start = this.get(moves); // Start at new moves index
		System.out.println("Start: " + start.value);
	}
	
	// Links last to first
	private void linkLast(){
		System.out.println("Current Count: " + currentCount);
		if (currentCount == 1){
			start.next = start;
			return;
		}
		this.get(currentCount - 1).next = start;
	}
	
	public void printList()
	{
		System.out.println(this.toString());
	}
	
	public String toString(){
		String list = "";
		if (currentCount == 1) return ""+this.start.value;
		for (int i = 0; i < currentCount; i++){
			list += " " + this.get(i).value;
		}
		return list;
	}
	
	public void add(int val)//O(N)
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
	public void insert(int val, int index)
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
		if(index >= 0 && index <= currentCount)
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
	public PotatoList<Integer>.Node get(int index)//O(N)
	{
		if(index >= 0 && index <= currentCount)
		{
			Node current = start;
			for(int i = 0; i < index; i++)
			{
				current = current.next;
			}
			//current = node at the index
			return current;
		}
		else
		{
			return start;
		}
	}

	class Node
	{
		int value;
		Node next;
		private Node(int v)
		{
			value = v;
			next = null;//no node after this one
		}
	}
}
