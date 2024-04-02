import java.util.Iterator;

public class StackLinkedList implements Stack {

	private Node head;
	
	
	
	public StackLinkedList() {
		head = null;
	}

	
	@Override
	public void push(char x) {
		Node temp = new Node(x);
		temp.nextNode = head;
		head = temp;
		
	}

	@Override
	public char pop() {
		
		if(head==null) {
			System.out.println("\n"+"Stack is Empty ... underflow condition");
			
		}
		else {
			Node temp = head;
			char t = temp.value;
			head = temp.nextNode;
			return t;
		}
		
		
		return 0;
	}

	@Override
	public boolean isBalanced(char[] expr) {
		StackLinkedList s = new StackLinkedList();
		char ch;
		
		  for (int i = 0; i < expr.length; i++) {
	            if (expr[i] == '(' || expr[i] == '{' || expr[i] == '[') {
	                s.push(expr[i]);
	                continue;
	            }
	            
	            if (s.isEmpty()) {
	            	System.out.println("Emptu");
	                return false;
	            }
	            
	            switch (expr[i]) {
	                case ')':
	                    ch = s.top();
	                    s.pop();
	                    if (ch == '{' || ch == '[') {
	                        return false;
	                    }
	                    break;
	                case '}':
	                    ch = s.top();
	                    s.pop();
	                    if (ch == '(' || ch == '[') {
	                        return false;
	                    }
	                    break;
	                case ']':
	                    ch = s.top();
	                    s.pop();
	                    if (ch == '(' || ch == '{') {
	                        return false;
	                    }
	                    break;
	            }
	        }
		return s.isEmpty();
	}

	public static void main(String[] args) {
		
		StackLinkedList linkedList = new StackLinkedList();
		linkedList.push('H');		
		linkedList.push ('e'); 
		linkedList.push ('l'); 
		linkedList.push ('l'); 
		linkedList.push ('o');
		
		
		System.out.print(linkedList.pop());
		System.out.print(linkedList.pop());
		System.out.print(linkedList.pop());
		System.out.print(linkedList.pop());
		System.out.print(linkedList.pop());
		System.out.print(linkedList.pop());
		
		
		//Activity 3
		StackLinkedList linkedList2 = new StackLinkedList();
		char[] str = ("I Love Programming").toCharArray();
		int len = str.length;
		
		for (int i = 0; i<len;i++) 
			linkedList2.push(str[i]);
		
		for(int j=0;j<len;j++)
			System.out.print(linkedList2.pop());
		
		//Activity 4
		String expr = "[0]{}{[00]()}";
//		String expr = "[(])";
		System.out.println();
		System.out.println("Input expression : "+ expr);
		if(linkedList2.isBalanced(expr.toCharArray()))
		System.out.println("Balanced");		
		else
		System.out.println("Not Balanced");
		
				


	}


	

	@Override
	public boolean isEmpty() {
		if(head==null) return true;
		else
		return false;
	}


	@Override
	public char top() {
		
		return head.value;
	}
}
