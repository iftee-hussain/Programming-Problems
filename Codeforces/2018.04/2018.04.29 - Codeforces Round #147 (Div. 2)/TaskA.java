package codes;

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.HashMap;

public class TaskA {
    static class Pair{
        int x ,y;
        Pair(int x , int y){
            this.x=x;
            this.y=y;
        }


    }
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n, h, m, h0, m0, cnt=1, cash=1;
       n = in.nextInt();
       h0 = in.nextInt();
       m0 = in.nextInt();
        while (--n > 0)
        {
            h = in.nextInt();
            m = in.nextInt();

            if (h == h0 && m == m0)
            {
                cnt += 1;
                if (cnt > cash)
                {
                    cash = cnt;
                }
            }
            else
            {
                cnt = 1;
            }
            h0 = h;
            m0 = m;
        }
       out.print(cash);

    }
}
