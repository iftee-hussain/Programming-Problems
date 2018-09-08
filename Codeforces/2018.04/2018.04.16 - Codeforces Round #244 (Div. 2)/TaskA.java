package codes;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class TaskA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n;
        int t,count=0,per=0;
       n = in.nextInt();
        while(n-->0)
        {
           t = in.nextInt();
            if(t==-1)
            {
                if(per>0)
                    per--;
                else
                    count++;
            }
            else
                per += t;
        }
        out.print(count);
    }
}
