package mypackage;

public class Goods2 {
	public String name; 	// 모든 접근이 가능(접근 제한이 없음)
	protected int price; 	// 자식 접근이 가능 + 같은 패키지
	int countStock;			// default
	private int countSold;	// 클래스 내부에서만 접근가능
	
	public void m() {
		countSold = 10;
	}
}
