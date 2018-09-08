package codes;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class TaskA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.nextInt();
        int d = in.nextInt();

        int min = 0, jokes = 0;

        for (int i = 0; i < n; i++)
        {
            int  t = in.nextInt();
            min += t;
            if (i < n - 1)
            {
                jokes += 2;
                min += 10;
            }
            else
            {
                jokes += (d - min) / 5;
            }
        }

        if (min > d)
           out.print(-1);
        else
            out.print(jokes);
    }
}
