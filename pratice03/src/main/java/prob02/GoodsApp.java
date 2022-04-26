package prob02;

import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class GoodsApp {
	private static final int COUNT_GOODS = 3;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Goods[] goods = new Goods[COUNT_GOODS];

		// 상품 입력
		for(int i = 0; i < COUNT_GOODS; i++) {
			String goodsInput = scanner.next();
			String[] rGoods = goodsInput.split(" ");
			goods[i].setGoods(rGoods[0]);
			goods[i].setPrice(Integer.parseInt(rGoods[1]));
			goods[i].setCount(Integer.parseInt(rGoods[2]));	
		}
		// 상품 출
		for(int i = 0; i < COUNT_GOODS; i++) {
			goods[i].callGoods();
		}
		// 자원정리
		scanner.close();
	}
}
