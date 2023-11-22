package core;

import java.util.ArrayList;

public class Stack implements IStack {
	private ArrayList<Object> stack = new ArrayList<Object>();
	
	
	public Object getStack(int g){
		return stack.get(g);
	}
	
	public void setCapacity(int a) {
		stack = new ArrayList<Object>(a);
	}

	@Override
	public boolean isEmpty() {
		return stack.isEmpty();
	}

	@Override
	public int getSize() {
		return stack.size();
	}

	@Override
	public boolean isFull() {
		int s = stack.size();
		if (stack.get(s) != null) {
			return true;
		}
		return false;
	}

	@Override
	public void push(Object elm) {
		stack.add(elm);
	}

	@Override
	public Object top() {
		Object top = null;
		for (int i =0;i<stack.size();i++) {
			top = stack.get(i);
		}
		return top;
	}
}
