public class ChessKnightMTester
{
  static public void main(String args[])
  {
    
    ChessKnightM cn = new ChessKnightM("d4");
    System.out.println(cn.toString());
    System.out.println(cn.isKnightReachableSquare("c6"));
    System.out.println(cn.isKnightReachableSquare("e6"));
    System.out.println(cn.isKnightReachableSquare("b5"));
    System.out.println(cn.isKnightReachableSquare("b3"));
    System.out.println(cn.isKnightReachableSquare("f3"));
    System.out.println(cn.isKnightReachableSquare("c2"));
    System.out.println(cn.isKnightReachableSquare("e2"));
    System.out.println(cn.isKnightReachableSquare("d4"));
    System.out.println(cn.isKnightReachableSquare("e4"));
    cn.moveToSquare("c6");
    cn.moveToSquare("c7");
  }
}


