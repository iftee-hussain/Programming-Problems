package codes;

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.Arrays;

public class TaskA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {

        long s=0;

        int n = in.nextInt();
        long a[] = new long[n];
        for(int i=0;i<n;i++)
        {
            a[i] = in.nextLong();
            s+=a[i];
        }

        if(s%2==0)
           out.print(s);

        else
        {
            Arrays.sort(a);
            for(int i=0;i<n;i++)
            {
                if((s-a[i])%2==0)
                {
                    out.print(s-a[i]);
                    break;
                }
            }
        }

    }

}
