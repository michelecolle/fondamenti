/**
Semplice realizzazione del pezzo degli schacchi Cavallo.

*/
public class ChessKnightM
{
  private int row = 0;
  private int col = 0;
  private static final String allowedRowChars = "abcdefgh";
  private static final String allowedColChars = "12345678";

  public ChessKnightM(String initialSquare)
  {
    if(!isChessValidSquare(initialSquare)){
      System.out.println("Invalid position, default a1 setted");
      return;
      }
    
    row = getIndex(initialSquare.charAt(0),  allowedRowChars);
    col = getIndex(initialSquare.charAt(1), allowedColChars);
    //System.out.println("starting coords: "+row+" " +col);
  }
  /**
  Verifica se la casa specificata e' una casa valida della scacchiera, ovvero se la stringa che la definisce e' di due caratteri di cui il primo appartenente all'intervallo di caratteri [a, h], il secondo all'intervallo di caratteri [1, 8].
  @param chessSquare la casa specificata
  */
  public boolean isKnightReachableSquare(String chessSquare)
  { 
    if(!isChessValidSquare(chessSquare)) 
      return false;
    int trow = getIndex(chessSquare.charAt(0),  allowedRowChars);
    int tcol = getIndex(chessSquare.charAt(1), allowedColChars);
    
    //System.out.println("starting coords: "+row+" " +col);
    //System.out.println("checking coords: "+trow+" " +tcol);
    
    //caso speciale la posizione e' quella attuale
    if(trow == row && tcol == col) 
      return true;
      
    //valuto prima le colonne e poi le righe
    if(Math.abs(trow - row)==1)
      if(Math.abs(tcol - col)==2)
        return true;
    
    if(Math.abs(trow - row)==2)
      if(Math.abs(tcol - col)==1)
        return true;
    
    return false;
  }
  public void moveToSquare(java.lang.String toChessSquare)
  { 
    if(isKnightReachableSquare(toChessSquare))
    { 
      row = getIndex(toChessSquare.charAt(0),  allowedRowChars);
      col = getIndex(toChessSquare.charAt(1), allowedColChars);
      System.out.println("Knight moved to: "+toString());
    }
    else
      System.out.println("illegal move");
  }
  public String toString()
  { 
    return ""+allowedRowChars.charAt(row) + allowedColChars.charAt(col);
  }
  public static boolean isChessValidSquare(String chessSquare){
    if(chessSquare.length() != 2)
      return false;
    int row = getIndex(chessSquare.charAt(0),  allowedRowChars);
    int col = getIndex(chessSquare.charAt(1), allowedColChars);
    return (row!=-1)&&(col!=-1);

  }
  private static int getIndex(char c, String arr)
  {
    for(int i = 0;i<arr.length();i++)
    { 
      if(c == arr.charAt(i))
        return i;
    }
    return -1;
  }
}
