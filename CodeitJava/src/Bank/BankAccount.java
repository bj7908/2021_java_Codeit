package Bank;

public class BankAccount {
		private int balance;
		private Person owner;
		
		//getter setter
		public void setBalance(int newBalance) {
			if(newBalance >= 0) {
				balance = newBalance;
			}
		}
		public int getBalance() {
			return balance;
		}
		
		public void setOwner(Person newOwner) {
			owner = newOwner;
		}
		public Person getOwner() {
			return owner;
		}
		
		//입금
		//parameter : 입금할 액수 (int)
		//return : 성공여부 (boolean)
		boolean deposit(int amount) {
			if(amount >= 0 && owner.getCashAmount() >= amount){
	            balance = balance + amount;
	            owner.setCashAmount(owner.getCashAmount() - amount);
	            
	            System.out.println(amount+"원 입금하였습니다. 잔고: "+balance+"원, 현금: "+owner.getCashAmount()+"원");
	            return true;
	        }else{
	            System.out.println("입금 실패입니다. 잔고: "+balance+"원, 현금: "+owner.getCashAmount()+"원");
	            return false;
	        }
		}
		
		//출금
		//parameter :  출금할 액수 (int)
		//return : 성공여부 (boolean)
		boolean withdraw(int amount) {
			if(amount >= 0 && balance >= amount ){
	            balance = balance - amount;
	            owner.setCashAmount(owner.getCashAmount() + amount);
	            
	            System.out.println(amount+"원 출금하였습니다. 잔고: "+balance+"원, 현금: "+owner.getCashAmount()+"원");
	            return true;
	        }else{
	            System.out.println("출금 실패입니다. 잔고: "+balance+"원, 현금: "+owner.getCashAmount()+"원");
	            return false;
	        }
		}
		
		
		//첫 번째 파라미터 : 받는 사람 (Person)
		//두 번쨰 파라미터 : 이체할 금액 (int)
		//return : 성공여부 (boolean)
//		boolean transfer(Person to, int amount) {
//			
//		}
}
