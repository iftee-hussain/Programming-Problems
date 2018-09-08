package codes;

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.math.BigInteger;

public class TaskA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        String x = in.nextString();

        for (int i = 0; i < x.length(); i++) {
            int d1 = Integer.parseInt(x.charAt(i)+"");
            int d2 = 9 - d1;

            if(i == 0){
                if(d1 == 0 || d2 == 0)
                out.print(d1==0?d2:d1);
                else
                    out.print(d1>d2?d2:d1);
            }
            else {
                out.print(d1>d2?d2:d1);
            }
        }
        
    }
}
