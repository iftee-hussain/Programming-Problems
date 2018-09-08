package codes;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class TaskA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.nextInt();
        String x = Integer.toBinaryString(n);

        int count = 0 ;
        for(int i = 0;i<x.length();i++){
            if(x.charAt(i) == '1')
                count++;
        }
        out.print(count);
    }
}
