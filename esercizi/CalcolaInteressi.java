public class CalcolaInteressi
{
  public static void main(String[] args)
  {
    BankAccount account = new BankAccount();
    account.deposit(100);
    Object test = "starting balance: " + account;
    System.out.println(test.getClass());
    System.out.println(test);
    
    System.out.println("starting balance: " + account.getBalance());
    account.deposit(computeYearlyInterest(account, 5.0));
    System.out.println("Balance after a year: " + account.getBalance());
    
  }
  static double computeYearlyInterest(BankAccount ba, double interestPercenteage)
  {
    return ba.getBalance()*interestPercenteage/100.0;
  }
}
