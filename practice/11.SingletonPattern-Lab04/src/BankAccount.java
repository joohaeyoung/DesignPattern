
public class BankAccount {
	
	private int accountNumber;
	
	public BankAccount(){
		
		//SerialNumberGenerator 는 딱 한번만 생산되어야 한다.
		accountNumber = SerialNumberGenerator.getInstance().getNext();
		
	}
	
	@Override
	public String toString(){
		return String.format("계좌번호 : %d ", accountNumber);
	}
}
