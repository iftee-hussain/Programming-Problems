package codes;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class TaskA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n =in.nextInt();
        if(n%5 == 0) out.print(n/5);
        else out.print((int)(n/5)+1);
    }
}
