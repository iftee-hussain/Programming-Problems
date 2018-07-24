package codes;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class TaskA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.nextInt();
        int m = in.nextInt();

        int day  =0;
        while(n>0){
            day++;
            if(day % m  == 0) n++;
            n--;
        }
        out.print(day);
    }
}
