package _1115;

class Account{
	private String accountNumber;
	private String accountholder;
	private int balance;
	private String password;
	final int MIN_BALANCE = 0;
	final int MAX_BALANCE = 1000000000;
	final int MIN_TRANSFER= 0;
	final int MAX_TRANSFER= 1000000;
	
	
	public Account(){
		this.accountNumber = "계좌 없음";
		this.accountholder = "이름없음";
		this.balance = 0;
	
	}

	public Account(String accountNumber, String accountholder, int balance) {
		this.accountNumber = accountNumber;
		this.accountholder = accountholder;
		this.balance = balance;
		
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountholder() {
		return accountholder;
	}

	public void setAccountholder(String accountholder) {
		this.accountholder = accountholder;
	}

	public int getBalance() {
		return balance;
	}

	public void deposit(int balance) {
		if(balance >= MAX_TRANSFER) {
			System.out.println("최대 송금액은 100만원을 넘을 수 없습니다.");
		}else {
			setBalance(this.balance + balance);
		}
	}
	
	public void Withdrawal(int balance) {
		if(balance <= MIN_TRANSFER) {
			System.out.println("최소 인출액은 0원을 넘을 수 없습니다.");
		}else {
			setBalance(this.balance - balance);
		}
	}
	
	public void setBalance(int balance) {
		if(this.balance >= MAX_BALANCE) {
			System.out.println("최대 예금액은 10억을 넘을 수 없습니다.");
		}else if(this.balance <= MIN_BALANCE){
			System.out.println("최소 예금액은 0원을 넘을 수 없습니다.");
		}else {
		this.balance = balance;
		}
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", accountholder=" + accountholder + ", balance=" + balance
				+ ", password=" + password + ", MIN_BALANCE=" + MIN_BALANCE + ", MAX_BALANCE=" + MAX_BALANCE
				+ ", MIN_TRANSFER=" + MIN_TRANSFER + ", MAX_TRANSFER=" + MAX_TRANSFER + "]";
	}
	
}

class Bank{
	
}





public class _12 {
	public static void main(String[] args) {
		
	}
}
