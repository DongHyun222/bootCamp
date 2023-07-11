package 스택리뷰;

import 스택리뷰.IntStack.EmptyIntStackException;
import 스택리뷰.IntStack.OverFlowIntStackException;

public class IntStack {
	public class OverFlowIntStackException extends RuntimeException {
	}



	public class EmptyIntStackException extends RuntimeException {
	}

	private int[] stk;
	int capacity;	//최대저장 갯수
	int ptr;		//현재저장할 위치(현재 저장 갯수)
	
	public IntStack(int len) {
		stk = new int[len];
		capacity = len;
	}

	public IntStack() {
		this(64);	//객체 초기화 목적(기능)
		System.out.println();
	}

	public boolean push(int i) {
		if (ptr == capacity)
			throw new OverFlowIntStackException();
		stk[ptr++] = i;
		return true;
	}
	
	
	
	public int pop() throws EmptyIntStackException{
		if (ptr == 0)
			throw new EmptyIntStackException();
		return stk[--ptr];
	}
	
	
}
