package codes;

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.math.BigInteger;

public class TaskB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {

        BigInteger n = new BigInteger(in.nextString());
        BigInteger m =  new BigInteger(in.nextString());

        if(m.equals(BigInteger.ONE))
        {
            BigInteger tmp = n.multiply(n.subtract(BigInteger.ONE)).divide(new BigInteger("2"));
            out.print(tmp + " "+tmp);
            return;
        }

        BigInteger min = n.divide(m);
        if (n.mod(m).compareTo(BigInteger.ZERO) > 0) {
            min = min.add(BigInteger.ONE);
             out.print(min.multiply(min.subtract(BigInteger.ONE)).divide(new BigInteger("2")).multiply(n.mod(m)) +" ");
        } else {
            //out.print("x");
            min = min.setScale(0, RoundingMode.HALF_UP);
            out.print(min.multiply(min.subtract(BigInteger.ONE)).divide(new BigInteger("2")).multiply(m)+ " ");
        }


        BigInteger max = n.subtract(m).add(BigInteger.ONE);
        out.print(max.multiply(max.subtract(BigInteger.ONE)).divide(new BigInteger("2")));

    }
}
