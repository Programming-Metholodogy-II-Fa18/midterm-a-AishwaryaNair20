
public class Data {
	
	public Node head = new Node();
	public Node tail = new Node();
	public int numElements = 0;
	
	public Data()
	{
		
	}
	
	public void add(int val)
	{
		if(numElements == 0)
		{
			head.data = val;
			tail = head;
			numElements++;
		}
		else
		{
			Node temp = new Node();
			temp = head;
			head = new Node();
			head.data = val;
			head.next = null;
			head.prev = temp;
			
			numElements++;
			
		}
	}
	
	
	public int remove()
	{
		
		int valToRemove = tail.data;
		
		int i = 0;
		Node temp = head;
		
		while(i < numElements-2 & temp != null)
		{
			temp = temp.prev;
			i++;
		}
		
		tail = temp;
	
		return valToRemove;
		
	}
	
	public int getValue(int ind)
	{
		if(ind > numElements)
			return -1;
		
		Node temp = head;
		System.out.println(temp.data);
		
		int i = 0;
		
		while(i <= ind && temp.prev != null)
		{
			temp = temp.prev;
			i--;
		}
		
		
		return temp.data;
		
	}
	
	public void printList()
	{
		int i = 0;
		Node temp = head;
		
		while(i<numElements && temp != null)
		{
			System.out.println(temp.data);
			temp = temp.prev;
			i++;
		}
		
	}
	
	public int getNumElements()
	{
		return numElements;
	}

}
