package codes;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class TaskA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.nextInt();

        int i = 1;
        int h = 1;
        int sum = 0;
        while(true){
            sum += h*(h+1)/2;
           if(sum >=n)
                break;

            ++h;
        }

        if(sum == n)
            out.print(h);
        else
            out.print(--h);

    }
}
