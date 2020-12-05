//Lab7Ex9
//Corey Dennison T00185828  
/*This program mimic an account with a balance of €100000. Every year, an interest of 3% is added on
 *and the owner withdraws €12000. This process is repeated using a while loop, and the year that €12000
 *cannot withdrawn as the balance is too low is shown*/

public class Lab7Ex9 {
    public static void main(String args[]) {
        
			float balance=100000;
			double rate = balance/100*3;
			int year=1;

			while(balance>12000)
			{
				balance+=rate;
				//balance = balance - 12000
				balance-=12000;
				System.out.println("You account balance at the end year " + year + 
					" is Eur"+String.format("%.2f",balance));
				year++;
			}	
				
			System.out.println("\nFrom year " + /*As 'year++;' runs before the loop ends, '(year-1)' 
			*takes the count back to the original value*/(year-1) + ", your balance is EUR" + String.format("%.2f", balance) + 
			".\nAs a result you can no longer make the usual withdrawal of EUR12,000.00");
    }
}
