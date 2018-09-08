package codes;

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.Arrays;

public class TaskA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.nextInt();
        int [] nn = in.nextIntArray(n);

        Arrays.sort(nn);
        if(nn[0] == 1)
            out.print(-1);
        else
            out.print(1);
    }
}
