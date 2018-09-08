package codes;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class TaskA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.nextInt();
        int numOfTF = 0, numOfF = 0;
        for (int i = 0; i < n; i++) {
           int k = in.nextInt();
            if (k == 25) {
                numOfTF++;
            } else if (k == 50) {
                if (numOfTF >= 1) {
                    numOfTF--;
                    numOfF++;
                } else {
                   out.print("NO");
                    return;
                }
            } else if (k == 100) {
                if (numOfF >= 1 && numOfTF >= 1) {
                    numOfF--;
                    numOfTF--;
                } else if (numOfF == 0 && numOfTF >= 3) {
                    numOfTF -= 3;
                } else {
                    out.print("NO");
                    return;
                }
            }
        }
        out.print("YES");





    }
}
