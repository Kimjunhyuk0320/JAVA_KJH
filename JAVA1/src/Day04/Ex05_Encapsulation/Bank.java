package Day04.Ex05_Encapsulation;

public class Bank {
	public static void main(String[] args) {
		Encapsulation ec = new Encapsulation(0, "국민은행", "282401-04-109955", "한성호");
		//ec.deposit = 100000;
		ec.setDeposit(100000);
		
		int money = ec.getDeposit();
		System.out.println(ec);
		System.out.println("계좌 잔액 : " + money);
	}
}
