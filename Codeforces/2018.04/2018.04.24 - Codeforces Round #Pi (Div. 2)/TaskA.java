package codes;

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.Arrays;

public class TaskA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.nextInt();
        int x[] = new int[n];

        for (int i = 0; i < n; i++) {
            x[i] = in.nextInt();
        }


        for (int i = 0; i < n; ++i) {
            int lo = Integer.MAX_VALUE;
            int hi = Integer.MIN_VALUE;
            if (i - 1 >= 0) lo = Math.min(lo, Math.abs(x[i] - x[i - 1]));
            if (i + 1 < n) lo = Math.min(lo, Math.abs(x[i] - x[i + 1]));
            if (i > 0) hi = Math.max(hi, Math.abs(x[i] - x[0]));
            if (i < n - 1) hi = Math.max(hi, Math.abs(x[i] - x[n - 1]));

            out.println(lo + " "+hi);
        }

    }
}
