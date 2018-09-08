package codes;

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.Arrays;

public class TaskA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int k = in.nextInt();
        int p[] = new int[12];

        for(int i = 0;i<12;i++)
            p[i] = in.nextInt();

        Arrays.sort(p);

        int sum = p[11];
        int count =1;
        int i =10;
        if(k>0){
            while (sum< k  && i>=0){
                sum+= p[i];
                i--;
                count++;
            }
            if(sum>=k)
            out.print(count);
            else
                out.print(-1);
        }else{
            out.print(0);
        }

    }
}
