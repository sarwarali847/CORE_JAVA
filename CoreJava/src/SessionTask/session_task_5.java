/* Exception handling:

Create an Account Class with attribute private acc_balance = 0 and 
withdraw(int amount) method for withdrawal of amount and 
showBalance() to show balance.

Create own exception class as WithdrawException and its object should be thrown if 
asked withdrawal amount is greater than balance amount else show withdraw amount success.

psv main(){

    Account ac = new Account(25000);//initial balance set
	ac.withdraw(30000); 		    //handle exception --> Insufficient balance
    ac.withdraw(20000); 		     //fine
    ac.showBalance();		        //Balance: 5000
	ac.withdraw(10000); 	     	//handle exception --> Insufficient balance
	ac.showBalance();		        //Balance: 5000*/




package SessionTask;


public class session_task_5 {

	public static void main(String[] args) {
		
		 account ac=new account();
		 ac.setAcc_balance(50000);
		 ac.withdraw(40000);
		 ac.showbalance();
		 ac.deposit(10000);
		 
		 
	}
}

class account{
	private int acc_balance=0;
	

public void withdraw(int amount) { 
	
	try {
	if(amount>getAcc_balance())
	{
		throw new Exception("Entered amount should be less than balance amount!");
	}
	}
	catch(Exception e) {
		System.err.println("Amount is greater than balance amount "+e.getMessage());	
	}

	finally {
		System.out.println("Done!");
	}
	
	
		if(amount<getAcc_balance())
		{
			acc_balance=acc_balance-amount;
			System.out.println(amount+", Withdrawn Successfully!");
		}
	
}
	
	

   public void showbalance(){
	   
      System.out.println("Available amount:"+acc_balance);
      
	}
   
   public void deposit(int amnt) {
	   acc_balance=acc_balance+amnt;
	   System.out.println("Amount deposited:"+amnt);
	   System.out.println("Availabe amount:"+acc_balance);
   }


public int getAcc_balance() {
	return acc_balance;
}


public void setAcc_balance(int acc_balance) {
	this.acc_balance = acc_balance;
}
	
}
  
	
