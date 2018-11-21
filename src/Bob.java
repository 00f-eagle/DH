import java.math.BigInteger;
import java.util.Scanner;

public class Bob {


    public BigInteger B;
    private BigInteger p;
    private BigInteger g;

    private int b;


    Bob(BigInteger p, BigInteger g){

        this.p = p;
        this.g = g;

        Scanner in = new Scanner(System.in);

        System.out.println("Введите любое число (b - private):");
        b = in.nextInt();

        B = g.pow(b).mod(p);
    }

    public void Key(BigInteger A){

        BigInteger K = A.pow(b).mod(p);;

        System.out.println("Key Bob: " + K);

    }


    public BigInteger getB() {
        return B;
    }

}
