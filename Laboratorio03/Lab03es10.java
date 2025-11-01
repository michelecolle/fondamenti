import java.util.Scanner;
public class Lab03es10 
{
//deve essere statica in modo da essere accessibile alla funzione main
final static String months_len_10 = "Gennaio\b\b\bFebbraio\b\bMarzo\b\b\b\b\bAprile\b\b\b\bMaggio\b\b\b\bGiugno\b\b\b\bLuglio\b\b\b\bAgosto\b\b\b\bSettembre\bOttobre\b\b\bNovembre\b\bDicembre\b\b";
  static int GetNumberFromConsole()
  {        
    Scanner sc = new Scanner(System.in);
    int i = sc.nextInt();
    return i;
  }
  public static void main(String[] args) 
  {
    while(true)
    {
      System.out.println("Inserire il numero del mese (1-12)");
      int i =GetNumberFromConsole();
      while(i<=0 || i>12)
      {
        System.out.println("Errore, il numero inserito deve essere tra 1 e 12");
        i = GetNumberFromConsole();
      }
      System.out.println(months_len_10.substring((i-1)*10, i*10-1));
    }
  }
}
