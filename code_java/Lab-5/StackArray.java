
public class StackArray implements Stack {

	private int tos;
	private char[] values;
	
	
	
	public StackArray(int x) {		
		this.tos = -1;
		this.values = new char[x];
	}//end constructor

	@Override
	public void push(char x) {

		if(tos==9)
			System.out.println("Stack overflow condition");		
		else
			values[++tos] = x;
		
	}//end push

	@Override
	public char pop() {
			if(tos==-1) { 
				System.out.println("Stack underflow condition");
			}
			else {
				return values[tos--];
			}
		return 0;
	}

	

	public static void main(String[] args) {
		
		StackArray array = new StackArray(10);
		array.push('B');
		array.push('S');
		array.push('S');
		array.push('E');
		array.push('3');
		array.push('Z');
		
		System.out.println(array.pop());
		System.out.println(array.pop());
		System.out.println(array.pop());
		System.out.println(array.pop());
		System.out.println(array.pop());
		System.out.println(array.pop());
		System.out.println(array.pop());
		

	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public char top() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isBalanced(char[] expr) {
		// TODO Auto-generated method stub
		return false;
	}

}//end class
