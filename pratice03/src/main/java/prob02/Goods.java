package prob02;

public class Goods {
	private static String goods;
	private static int price;
	private static int count;

	public static String getGoods() {
		return goods;
	}

	public static void setGoods(String goods) {
		Goods.goods = goods;
	}

	public static int getPrice() {
		return price;
	}

	public static void setPrice(int price) {
		Goods.price = price;
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Goods.count = count;
	}
	
	public static void callGoods() {
		System.out.println(goods+"(가격:" + price +"원)이 " + count + "개 입고 되었습니다.");
	}
}
