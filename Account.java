//Taylor Mulkey July 14th
//Withdraw from bank Account

package withdraw.java;

public class Account {
    private String name; // instance variable
    
    public void setName(String name){
        this.name = name; //storing name
    }
    
    public String getName() {
        return this.name;
    }
private double balance; // instance variable
    
    // Account constructors that receives two parameters

    /**
     *
     * @param name
     * @param balance
     */

    public Account(String name, double balance) {
        this.name = name; // assign name to instance variable name

        
        //validate that the balance is greater than 0.0; if it's not,
        //instance variable balance is unchanged and method prints a message
        
        if (balance >0.0) { // if the balance is valid
            this.balance = balance; // assign it to instance variable balance
        }
    }
    
    // method that withdraws (subtract) only a valid ammount from the balance
    public void withdraw(double withdrawAmount) {
        if (withdrawAmount >0.0) { // if the withdrawAmount is valid
            balance = balance - withdrawAmount; // subtract from the balance
        }
        if (withdrawAmount > balance) {
            System.out.println("Withdrawal ammount exceeded account balance");
        } else {
            balance -= balance;
        }
    }

    // method returns the account balance 
    public double getBalance () {
        return balance;
    }
}
