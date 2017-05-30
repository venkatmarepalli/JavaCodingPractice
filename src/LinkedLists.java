
public class LinkedLists {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList ll = new LinkedList();
		
		//Insert 10 elements in linkedlist
		for(int i=0;i<10;i++)
			ll.add(i+10);
		
		
		//Return count of elements
		System.out.print("--Number of elements--");
		System.out.println(ll.getCount());
		//Return head node data
		System.out.print("--Head Node Data--");
		System.out.println(ll.getHeadNodeData()==-1?"Empty LinkedList":ll.getHeadNodeData());
		//Return last node data
		System.out.print("--Last Node Data--");
		System.out.println(ll.getLastNodeData()==-1?"Empty LinkedList":ll.getLastNodeData());
		System.out.println("--Displaying elements--");
		ll.displayElements();
		System.out.println();
		System.out.println("--Insert at ith index--");
		if(ll.insertAtIndex(0,88)){
			System.out.print("--Number of elements after insertion--");
			System.out.println(ll.getCount());
			System.out.print("--Displaying elements after insertion--");
			ll.displayElements();
		}
		
	}

}

class LinkedList{
	private static int counter;
	private LinkNode head;
	private LinkNode tail;
	
	LinkedList(){
		
	}
	
	public void displayElements() {
		// TODO Auto-generated method stub
		LinkNode temp=head;
		while(temp!=null){
			System.out.print("|");
			System.out.print(temp.data);
			System.out.print("|");
			System.out.print("-->");
			temp=temp.next;
		}
		System.out.print("|NULL|");
	}

	public boolean insertAtIndex(int index, int data) {
		if(head==null){
			System.out.println("Cannot insert becoz its an empty list ");
			return false;
		}
		else if(index > this.getCount()){
			System.out.println("Cannot insert becoz Index is greater than the linkedlist");
			return false;
		}
		else{
			LinkNode newNode = new LinkNode(data);
			LinkNode temp=head;
			for(int i=1;i<index;i++){				
				temp=temp.next;
			}
			//if its last Node
			if(temp.next==null){
				temp.next=newNode;
				tail=newNode;
				counter++;
			}
			else if(temp==head){
				newNode.next=head;
				head=newNode;
				counter++;
			}
			else{
				newNode.next=temp.next;
				temp.next=newNode;
				counter++;
			}
			return true;
		}
	}

	public int getLastNodeData() {
		if(tail==null)
			return -1;
		else
			return tail.data;
	}

	public int getHeadNodeData() {
		if(head==null)
			return -1;
		else
			return head.data;
	}

	public int getCount() {
		return counter;
	}

	public void add(int i){
		if(head==null){
			head=new LinkNode(i);
			tail =head;
			counter++;
		}
		else{
			LinkNode newNode = new LinkNode(i);
			tail.next=newNode;
			tail=newNode;
			counter++;
		}
	}
}

 class LinkNode{
	
	LinkNode next;
	int data;
	
	public  LinkNode(){
		next=null;
		data=0;
	}
	
	public  LinkNode(int n){
		next=null;
		data=n;
	}
	
	public LinkNode(int n, LinkNode nextNode){
		data = n;
		next = nextNode;
	}
	
}