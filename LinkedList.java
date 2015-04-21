import java.util.*;
public class LinkedList{

	Node head; 

	public void LinkdeList(Node n)
	{
		this.head = n;
	}
	public void push(int data)
	{
		Node node = new Node(data);
		node.next = this.head;
		this.head = node;
	}
	public void print()
	{
		System.out.println("Inside Print Node");
		Node temp = head; 
		while (temp != null)
		{
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	public void addList()
	{
		int sum = 0;
		Node temp = head;
		while(temp != null)
		{
			sum = sum+temp.data;
			temp = temp.next;
		}
		System.out.println("Sume = "+sum);
	}
	public void findMax()
	{
		int max = Integer.MIN_VALUE;
		Node temp = head;
		while(temp!=null)
		{
			if(temp.data >= max)
				max = temp.data;
			temp = temp.next;
		}
		System.out.println("Max value = "+max);
	}
	public void findMin()
	{
		int min = Integer.MAX_VALUE;
		Node temp = head;
		while(temp!=null)
		{
			if(temp.data<=min)
				min = temp.data;
			temp = temp.next;
		}
		System.out.println("Min value = " +min);
	}
	public int getLength()
	{
		Node temp = head;
		int listLength = 0;
		while(temp != null )
		{
			listLength++;
			temp = temp.next;
		}
		return listLength;
	}
	public void  delete(Node head)
	{
		head = head.next;

	}
	
	/*public void deleteMiddle()
	{
		int i=0;
		Node middleNode = head;
		Node temp ;
		while( i <= this.getLength()/2)
		{
			System.out.println("inside while");
			if(i == this.getLength()/2)
				middleNode =
			head = head.next;
			i++;
		}
		head = temp;
	}*/

	public void deleteLast()
	{
		Node curr = head; 
		Node prev = null;

		if(head.next == null)
			head = head.next;
		while(curr.next !=null)
		{
			prev = curr; 
			curr = curr.next;
		}
		prev.next = curr.next;
	}

	public void printValuefromLast(int s)
	{
		Node curr = head; 
		Node prev = head; 
		int count =0;
		while(curr!=null)
		{
			if(count >= s)
			{
				prev = prev.next;
			}
			curr = curr.next;
			count++;
		}
		System.out.println("Value from last"+prev.data);
	}

	public boolean isListPallindrom()
	{
		Stack st = new Stack();
		Node node = head;
		Node head2 = head;
		while (node!=null)
		{
			st.push(node.data);
			node = node.next;
		}

		while(head2!=null)
		{
			if(head2.data != (int)st.pop())
			{
				return false;
			}
			else
			{
				head2 = head2.next;
			}
		}
		return true;
		
	}

}