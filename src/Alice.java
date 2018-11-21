import java.math.BigInteger;
import java.util.Random;
import java.util.Scanner;

public class Alice {


    public BigInteger p;
    public BigInteger g;
    public BigInteger A;

    private int a;

    Alice(){

        p = RandomGenerate(63);

        g = RandomGenerate(8);

        Scanner in = new Scanner(System.in);

        System.out.println("Введите любое число (a - private):");
        a = in.nextInt();

        A = g.pow(a).mod(p);

    }

    private BigInteger RandomGenerate(int bitLength){

        Random rnd = new Random();

        boolean bool;

        BigInteger bigInteger;

        do {

            bigInteger = new BigInteger(bitLength, rnd);
            bool = bigInteger.isProbablePrime((int) Math.log(bigInteger.longValue()));

        }while(!bool);

        return bigInteger;
    }

    public void Key(BigInteger B){

        BigInteger K = B.pow(a).mod(p);;

        System.out.println("Key Alice: " + K);

    }


    public BigInteger getA() {
        return A;
    }

    public BigInteger getP() {
        return p;
    }

    public BigInteger getG() {
        return g;
    }

}
