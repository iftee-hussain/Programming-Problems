package codes;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class TaskA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        long n = in.nextLong(), k = in.nextLong(), part, output;

        if (n%2 == 0)
        {
           part = n/2;
        }
        else
        {
            part = (n/2) +1;
        }
       if(k<=part)
           output = (2*k) -1;
        else
            output =(k-part)*2;
        out.print(output);
    }
}
