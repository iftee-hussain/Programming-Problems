package codes;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class TaskB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.nextInt(),  m = in.nextInt();


        int loc = 1;
        long  ans = 0;
        for(int i=0; i<m; i++)
        {
            int now = in.nextInt();


            if(now >= loc)
                ans += now - loc;
            else
                ans += n - (loc - now);
            loc = now;
        }

       out.print(ans);

    }
}
