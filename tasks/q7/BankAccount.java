public class BankAccount implements Measurable {
    
    private double balance;
    
    /*  Const  */ 
    public BankAccount(double balance) {
        this.balance = balance;
    }

    /*  Getter and Setter  */ 
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    /*  Method  */ 
    @Override
    public String toString() {
        return "Bank[" + "balance=" + balance + ']';
    }
    
    @Override
    public double getAmount() {
        return balance;
    }
}
