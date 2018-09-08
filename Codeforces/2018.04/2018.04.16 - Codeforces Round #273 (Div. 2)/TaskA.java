package codes;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class TaskA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {

       int  a = in.nextInt(), b = in.nextInt(), c = in.nextInt(), d = in.nextInt(), e = in.nextInt();


        int s = a + b + c + d + e;

        if(s > 0 && s % 5 == 0)
            out.print(s / 5);
        else
            out.print(-1);
    }
}
