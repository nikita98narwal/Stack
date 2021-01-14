package stack;

public class StackLinkedList {
	
	class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	
	Node head = null;
	
	public boolean isEmpty() {
		if(head == null)
			return true;
		else
			return false;
	}

	void push(int data) {
		Node newNode = new Node(data);
		if(head == null)
			head = newNode;
		else {
			Node tempNode = head;
			head = newNode;
			newNode.next = tempNode;
		}
		System.out.println("Pushed "+ data);
	}
	
	int pop() {
		if(head == null) {
			System.out.println("Stack is Empty");
			return -1;
		}
		int popped = head.data;
		head = head.next;
		return popped;
	}
	
	int peek() {
		if(head == null) {
			System.out.println("Stack is Empty");
			return -1;
		}
		else {
			return head.data;
		}
	}

	public static void main(String[] args) {
		StackLinkedList s = new StackLinkedList();
		System.out.println(s.pop());
		s.push(1);
		s.push(2);
		s.push(3);
		s.pop();
		System.out.println("Top Element " + s.peek());
	}

}
