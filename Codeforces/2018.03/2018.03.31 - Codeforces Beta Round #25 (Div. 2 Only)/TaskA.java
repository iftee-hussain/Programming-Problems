package codes;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class TaskA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n, x, even = 0, lastodd = 0, lasteven = 0;
        n = in.nextInt();

        for (int i = 1; i <= n; ++i)
        {
            x = in.nextInt();
            if (x % 2 == 0)
            {
                even += 1;
                lasteven = i;
            }
            else
            {
                even -= 1;
                lastodd = i;
            }
        }

        out.print(even > 0 ? lastodd : lasteven);
    }
}
