public class BankAccountDemo
{
  public static void main(String[] args)
  {
    BankAccount account = new BankAccount();
    printBalance(account);
    account.deposit(100);
    printBalance(account);
    account.withdraw(20);
    printBalance(account);
    
  }
  static void printBalance(BankAccount ba)
  {
    System.out.println("Actual Balance: " + ba.getBalance());
  }
}
