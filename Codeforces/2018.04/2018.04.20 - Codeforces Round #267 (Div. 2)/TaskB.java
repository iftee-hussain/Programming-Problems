package codes;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class TaskB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.nextInt();
        int m = in.nextInt();
        int k = in.nextInt();

        int a [] = new int[m+1];
        String [] nBin = new String[m+1];

        for (int i = 0; i <= m; i++) {
            a[i] = in.nextInt();

        }

        int friends = 0;

        for (int i = 0; i < m; i++) {
            int t = 0;
            for (int j = 0; j < n; j++)
                if (((a[i] >> j) & 1) != ((a[m] >> j) & 1))
                    t++;
            if(t <= k)
                friends++;

         }
         out.print(friends);



    }
}
