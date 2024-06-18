package atm;
import bank.Bank; 
public class ATM{
    public static void main(String[] args) {
    	 Bank account = new  Bank("UNION BANK", 984858146,2824);
        account.Bankname(); 
        account.Accountnumber();
        account.Ifsccode();
    }
}
