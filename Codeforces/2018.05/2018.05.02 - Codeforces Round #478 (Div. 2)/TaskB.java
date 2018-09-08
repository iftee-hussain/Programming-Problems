package codes;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class TaskB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        long pro [] = new long[22];
        long a [] = new long[22];

        a = in.nextLongArray(14);



        long res = 0;

        for(int i=0;i<14;++i)
        {
            for(int j=0;j<14;++j)
                pro[j] = a[j];
            long tmp = pro[i];
            pro[i] = 0;
            for(int j=0;j<14;++j)
                pro[j] += tmp/14;
            tmp %= 14;
            int k = i+1;
            while(tmp-->0)
            {
                if(k == 14)
                    k = 0;
                pro[k++]++;
            }
            long score = 0;
            for(int j=0;j<14;++j)
            {
                if(pro[j] %2==1 )
                    continue;
                score += pro[j];
            }
            res = Math.max(res,score);
        }

        out.print(res);
    }
}
