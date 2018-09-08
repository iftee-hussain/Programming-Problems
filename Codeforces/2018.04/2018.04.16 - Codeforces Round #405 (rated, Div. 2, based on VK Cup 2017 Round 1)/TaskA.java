package codes;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class TaskA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int a,b;

        a = in.nextInt();
        b = in.nextInt();

        int cc= 0;
        while(a <= b){
            cc++;
            a*= 3;
            b*= 2;
        }

       out.print(cc);
    }
}
