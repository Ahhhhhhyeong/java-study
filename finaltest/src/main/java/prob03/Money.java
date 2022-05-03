package prob03;

public class Money {
	private int amount;

	/* 코드 작성 */
	public Money(int amount) {
		this.amount = amount;
	}

	public Object add(Money money) {
		return new Money(this.amount + money.amount);
	}

	public Object minus(Money money) {
		return new Money(this.amount - money.amount);
	}

	public Object multiply(Money money) {
		return new Money(this.amount * money.amount);
	}

	public Object devide(Money money) {
		return new Money(this.amount / money.amount);
	}

	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		if(!(obj instanceof Money)) {
			return false;
		}
		Money money = (Money) obj;
		return amount == money.amount;
	}

}
