public class MeasurableTester
{
    public static void main(String[] args)
    {
        Measurable[] accounts = new Measurable[3];
        accounts[0] = new BankAccount(10000);
        accounts[1] = new BankAccount(5000);
        accounts[2] = new BankAccount(6000);
        //accounts[3] = new BankAccount(6000);
        //accounts[4] = new BankAccount(9000);
        //accounts[5] = new BankAccount(100);
        double averageBalance = Data.average(accounts, BankAccount.Over_1K);
        System.out.println("Average balance: " + averageBalance);
    }
}