package codes;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class TaskC {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.nextInt();
        int a [] = new int[n];
        long cnt [] = new long[1000010];

        long s = 0;
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
            s+= a[i];
        }
        if(s%3 !=0) {
            out.print(0);
            return;
        }
        else {
            s /=3;
            long ss = 0;
            for (int i = n-1; i >=0; --i) {
                ss += a[i];
                if(ss == s)
                    cnt[i] = 1;
            }
            for (int i = n-2; i >=0 ; --i) {
                cnt[i] += cnt[i+1];
            }

            long ans = 0;
            ss = 0;
            for (int i = 0;  i+2<n; i++) {
                ss += a[i];
                if(ss==s)
                    ans += cnt[i+2];
            }

            out.print(ans);
        }
    }
}
