package chapter03;

import javax.swing.plaf.multi.MultiInternalFrameUI;

import tv.Value;

public class SwapTest01 {

	public static void main(String[] args) {
		Value a = new Value(10);
		Value b = new Value(20);
		
		System.out.println(a.val + ":" + b.val);
		
		// swap
		swap(a, b);
		
		System.out.println(a.val + ":" + b.val);

	}
	
	public static void swap(Value p, Value q) { // 변함없음
		int temp = p.val;
		p.val = q.val;
		q.val = temp;
	}

}
