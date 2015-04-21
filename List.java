public class List
{
	public static void main(String[] args)
	{
		LinkedList l = new LinkedList();
		l.push(1);
		l.push(1);
		l.push(5);
		l.push(0);
		l.print();
		l.addList();
		l.findMax();
		l.findMin();
		System.out.println(l.getLength());
		l.delete(l.head);
		l.print();
		//l.deleteMiddle();
		//l.print();
		l.deleteLast();
		l.print();
		l.printValuefromLast(2);
		System.out.println(l.isListPallindrom());
	}
}


