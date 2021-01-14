package stack;

class Stack{
	int top = -1;
	int max = 1000;
	int stack[] = new int[max];
	
	boolean isEmpty() {
		return (top<0);
	}
	
	 boolean push(int data) {
		if(top >= (max-1)) {
			System.out.println("Stack Overflow");
			return false;
		}
		else {
			stack[++top] = data;
			System.out.println("Pushed "+ data);
			return true;
		}
	}
	 
	 int pop() {
		 if(top < 0) {
			 System.out.println("Stack Underflow");
			 return 0;
		 }
		 else {
			 int data = stack[top--];
			 return data;
		 }
	 }
	 
	 int peek() {
		 if(top < 0) {
			 System.out.println("Stack Underflow");
			 return 0;
		 }
		 else {
			 int topElement = stack[top];
			 return topElement;
		 }
	 }
}

public class StackArray {

	public static void main(String[] args) {
		Stack s = new Stack();
	    s.push(7);
	    s.push(8);
	    s.push(9);
	    System.out.println("Poped Element "+ s.pop());
	    System.out.println("Top Element "+ s.peek());
	}
}
