package core;

public interface IStack {
	boolean isEmpty();
	int getSize();
	boolean isFull();
	void push(Object elm);
	Object top();
}
