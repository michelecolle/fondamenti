public class ex010 {

    public static void main(String[] args){
        double a = 123.45;
        double b = 987.65;
        System.out.println("init  a: " + a+" b: "+b);
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("sum   a: " + a+" b: "+b);

        a = 123.45;
        b = 987.65;
        a = a*b;
        b = a/b;
        a = a/b;
        System.out.println("mul   a: " + a+" b: "+b);

        a = 123.45;
        b = 987.65;
        a = b+(b=a)*0;
        //carica in memoria il valore di b 
        //assegna a b il valore di a
        //moltiplica il contenuto della parentesi (a) per 0 e lo somma al valore in memoria (b)
        //assegna ad a il valore in memoria (b)
        //tega..
        System.out.println("ass   a: " + a+" b: "+b );
    }
}
