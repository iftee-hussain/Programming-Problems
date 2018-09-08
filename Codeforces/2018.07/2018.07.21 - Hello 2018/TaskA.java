package codes;

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.math.BigInteger;

public class TaskA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        String n = in.nextString();
        String m = in.nextString();

        BigInteger nn = new BigInteger(n);
        BigInteger mm = new BigInteger(m);

        out.print(mm.mod(new BigInteger("2").pow(Integer.parseInt(n))));
    }
}
