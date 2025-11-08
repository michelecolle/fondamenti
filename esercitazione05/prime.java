import java.util.Scanner;
import java.util.LinkedList;
import java.util.List;
import java.util.Arrays;

public class prime
{
  public static List<Integer> primeNumbersBruteForce(int n) {
      List<Integer> primeNumbers = new LinkedList<>();
      for (int i = 2; i <= n; i++) {
          if (isPrimeBruteForce(i)) {
              primeNumbers.add(i);
          }
      }
      return primeNumbers;
  }
  public static boolean isPrimeBruteForce(int number) {
      for (int i = 2; i < number; i++) {
          if (number % i == 0) {
              return false;
          }
      }
      return true;
  }
  public static List<Integer> sieveOfEratosthenes(int n) {
    boolean prime[] = new boolean[n + 1];
    Arrays.fill(prime, true);
    for (int p = 2; p * p <= n; p++) {
        if (prime[p]) {
            for (int i = p * 2; i <= n; i += p) {
                prime[i] = false;
            }
        }
    }
    List<Integer> primeNumbers = new LinkedList<>();
    for (int i = 2; i <= n; i++) {
        if (prime[i]) {
            primeNumbers.add(i);
        }
    }
    return primeNumbers;
  }

  public static int biggestPrimeFactor(int n, List<Integer> primes)
  {
    int i = primes.size()-1;
    while(n%primes.get(i) != 0)
    {
      i--;
      if(i<0)
        return 1;
    }
    return primes.get(i);
  }
  

  public static void main(String[] args)
  {
    Scanner console = new Scanner(System.in);
    System.out.println("Insert integer for factorization");
    int n = console.nextInt();
    long start = System.currentTimeMillis();
    //List<Integer> primesToNbf = primeNumbersBruteForce(n);
    long stop = System.currentTimeMillis();
    System.out.println("time to find all primes brute force ms: "+(stop - start));
    
    start = System.currentTimeMillis();
    List<Integer> primesToN = sieveOfEratosthenes(n);
    stop = System.currentTimeMillis();
    System.out.println("time to find all primes sieveOfEratosthenes ms: "+(stop - start));
    
    //System.out.println("Primes to n:");
    //for(int i = 0; i < primesToN.size(); i++)
    //  System.out.print(primesToN.get(i)+ " " );
    System.out.println();
    System.out.print("Factorization: "+n+"=1");
    start = System.currentTimeMillis();
    int temp_n = n;
    int last_prime = 1;
    int tester = 1;
    do
    {
      last_prime = biggestPrimeFactor(temp_n, primesToN);
      System.out.print("*"+last_prime);
      tester = tester*last_prime;
      temp_n = temp_n/last_prime;
    }
    while(temp_n != 1);
    stop = System.currentTimeMillis();
    System.out.println();
    System.out.println("Tester: "+tester);
    System.out.println("time to factorize ms: "+(stop - start));
  }
}
