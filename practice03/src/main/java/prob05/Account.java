package prob05;

public class Account {

	private static String accountNo;
	private static int balance;

	public Account(String acc) {
		System.out.println(acc + " 계좌가 개설되었습니다.");
		accountNo = acc;
	}

	public String getAccountNo() {
		// 계좌번호 받음
		return accountNo;
	}

	public void setAccoutNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public int getBalance() {
		// 계좌의 잔고
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public void save(int save) {
		// 입금
		System.out.println(accountNo + " 계좌에 " + save + "만원이 입금되었습니다.");
		balance = balance + save;
	}

	public void deposit(int deposit) {
		// 출금
		System.out.println(accountNo + " 계좌에 " + deposit + "만원이 출금되었습니다.");
		balance = balance - deposit;
	}

}
