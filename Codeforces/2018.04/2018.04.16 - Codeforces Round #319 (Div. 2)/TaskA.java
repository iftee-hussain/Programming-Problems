package codes;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class TaskA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.nextInt();
        int x = in.nextInt();
         int count = 0;
        for (int i = 1; i <= n; i++)
            if (x % i == 0 && x / i <= n) count++;

        out.print(count);
    }
}
