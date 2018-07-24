package codes;

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.math.BigInteger;

public class TaskA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        BigInteger n = in.readBigInteger();
        BigInteger size1 = BigInteger.ZERO;
        BigInteger size2 = BigInteger.ZERO;
        BigInteger result =  BigInteger.ZERO;
        if(n.mod(new BigInteger(2+"")).equals(BigInteger.ZERO)){
            size1 = n.divide(new BigInteger(2+""));
            size2 = size1;
        }

        else{
            size1 = size2 = n.divide(new BigInteger(2+""));
            size2 = n.divide(new BigInteger(2+"")).add(BigInteger.ONE);
        }
        result = new BigInteger(2+"").multiply(size1.multiply(size1.add(BigInteger.ONE)).divide(new BigInteger(2+"")));
        result = result.subtract(size2.pow(2));
        out.print(result);

    }
}
