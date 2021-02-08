public class BankAccount implements Measurable
{  
    private double balance;
    public static final Filter Over_1K = new Filter() 
    {
        public boolean accept(Object x) 
        {
            Measurable obj = (Measurable) x;
            return obj.getMeasure() >= 1000.0;
        }
    };
    public BankAccount()
    {   
        balance = 0;
    }
    public BankAccount(double initialBalance)
    {   
         balance = initialBalance;
    }
    public void deposit(double amount)
    {  
        balance = balance + amount;
    }
    public void withdraw(double amount)
    {   
        balance = balance - amount;
    }
    public double getBalance()
    {   
        return balance;
    }
    public double getMeasure()
    {
        return balance;
    }
}