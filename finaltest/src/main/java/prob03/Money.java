package prob03;

import javax.naming.spi.DirStateFactory.Result;

public class Money {
	private int amount;
	
	/* 코드 작성 */

	public int getAmount() {
		return amount;
	}

	public Money(int amount) {
		this.amount = amount;
	}
	

	public Object add(Money money) {
		int result = this.amount + money.getAmount();
		return new Money(result);
	}

	public Object minus(Money money) {
		int result = this.amount - money.getAmount();
		return new Money(result);
	}

	public Object multiply(Money money) {
		int result = this.amount * money.getAmount();
		return new Money(result);
	}

	public Object devide(Money money) {
		int result = this.amount / money.getAmount();
		return new Money(result);
	}

	@Override
	public int hashCode() {		
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	
	
}
