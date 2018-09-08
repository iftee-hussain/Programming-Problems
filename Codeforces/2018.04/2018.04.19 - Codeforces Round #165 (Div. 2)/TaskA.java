package codes;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class TaskA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.nextInt();

        while (n-- > 0)
        {
           int a = in.nextInt();
            if (360 % (180 - a) == 0)
            {
                out.println("YES");
            }
            else
            {
                out.println("NO");
            }
        }
    }
}
