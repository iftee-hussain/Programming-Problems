package codes;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class TaskA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n1 = in.nextInt(), n2= in.nextInt(), n3 = in.nextInt(), n4=in.nextInt();

        int f = n1+n3;
        int s = n2+n4;

        if(n1>n2)
            out.print("First");
        else
            out.print("Second");
    }
}
