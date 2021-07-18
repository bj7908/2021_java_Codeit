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
		
		//�Ա�
		//parameter : �Ա��� �׼� (int)
		//return : �������� (boolean)
		boolean deposit(int amount) {
			if(amount >= 0 && owner.getCashAmount() >= amount){
	            balance = balance + amount;
	            owner.setCashAmount(owner.getCashAmount() - amount);
	            
	            System.out.println(amount+"�� �Ա��Ͽ����ϴ�. �ܰ�: "+balance+"��, ����: "+owner.getCashAmount()+"��");
	            return true;
	        }else{
	            System.out.println("�Ա� �����Դϴ�. �ܰ�: "+balance+"��, ����: "+owner.getCashAmount()+"��");
	            return false;
	        }
		}
		
		//���
		//parameter :  ����� �׼� (int)
		//return : �������� (boolean)
		boolean withdraw(int amount) {
			if(amount >= 0 && balance >= amount ){
	            balance = balance - amount;
	            owner.setCashAmount(owner.getCashAmount() + amount);
	            
	            System.out.println(amount+"�� ����Ͽ����ϴ�. �ܰ�: "+balance+"��, ����: "+owner.getCashAmount()+"��");
	            return true;
	        }else{
	            System.out.println("��� �����Դϴ�. �ܰ�: "+balance+"��, ����: "+owner.getCashAmount()+"��");
	            return false;
	        }
		}
		
		
		//ù ��° �Ķ���� : �޴� ��� (Person)
		//�� ���� �Ķ���� : ��ü�� �ݾ� (int)
		//return : �������� (boolean)
//		boolean transfer(Person to, int amount) {
//			
//		}
}
