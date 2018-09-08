package codes;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class TaskA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int a = in.nextInt();
        int b = in.nextInt();
        int n = in.nextInt();

        int sum =0 ;
        sum+= Math.abs(a) + Math.abs(b);

        n -= sum;

        if(n>= 0 && n%2==0)
            out.println("Yes");
        else
            out.println("No");
    }
}
