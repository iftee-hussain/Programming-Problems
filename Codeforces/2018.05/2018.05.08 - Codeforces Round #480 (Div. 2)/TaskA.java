package codes;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class TaskA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        String s = in.nextString();

        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'o')
                count++;
        }
        int n = s.length() - count;
        if (n % 2 == 0)
            out.print("YES");
        else {
            if (count >= 4 && count % 2 == 0)
                out.print("YES");

            else
                out.print("NO");

        }
    }
}
