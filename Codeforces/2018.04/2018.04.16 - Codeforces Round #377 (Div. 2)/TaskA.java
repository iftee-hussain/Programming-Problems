package codes;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class TaskA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
       int  k = in.nextInt(), r = in.nextInt();
       int h = 1, i = 0, j = 1;
       boolean b = true;
        while (b) {
            i++;
            h = k * i;
            if (h % 10 == 0 || h % 10 == r) {
                b = false;
            }
        }
       out.print(i);
    }
}
