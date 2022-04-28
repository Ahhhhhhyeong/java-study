package chapter03;

public class GoodsApp {

	public static void main(String[] args) {
		Goods goods = new Goods();
		
		goods.setName("Nikon");
		goods.setPrice(50000);
		goods.setCountSold(50);
		goods.setCountStock(30);
		goods.showInfo();
		
		Goods goods2 = new Goods("tv", 10000, 10, 10);
		goods2.showInfo();
		
		
		System.out.println("Goods Count: " + Goods.countOfGoods );

		
		// discount price 구하기
		
		int discountPrice = goods.calcDiscountPrice(0.5);
		System.out.println("Goods Discount Price: " + discountPrice);
	}

}
