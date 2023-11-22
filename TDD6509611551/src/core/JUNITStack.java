package core;

import junit.framework.TestCase;

public class JUNITStack extends TestCase {
	
	public void testCreateNewEmptyStack() {
		Stack s1 = new Stack();
		int size = s1.getSize();
		
		assertEquals(0, size); 
		assertTrue(s1.isEmpty());
	}
	
	public void testPushElmToTop() {
		Stack s2 = new Stack();
		s2.push(1);
		s2.top();
		
		assertEquals(1, s2.top());
	}
	
	public void testLastInFirstOut() {
		Stack s3 = new Stack();
		s3.setCapacity(4);
			 s3.push(1);
			 s3.push(2);
			 s3.push(3);
			 s3.push(4);
		 for(int j=4; j>=1 ;j--){
			 assertEquals(j, s3.getStack(j-1));
		 }
	}
	
	public void testPushElmToLimitedSizeStack() {
		Stack s4 = new Stack();
		s4.setCapacity(3);
			 s4.push(1);
			 s4.push(2);
			 s4.push(3);
			 s4.push(4);
		for(int i=3; i>=1 ;i--){
			 assertEquals(i, s4.getStack(i-1));
		}
	}

		
}
