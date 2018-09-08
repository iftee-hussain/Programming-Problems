package codes;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class TaskB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        long n = in.nextLong();
        long m = in.nextLong();

        long  min= n / m;
        if(n%m > 0) {
            min++;
            out.print(min *(min-1)/2 *(n%m )+ " ");
        }else{
            out.print(min *(min-1)/2*m+ " ");
        }



        long max = n -m+1;
        out.print(max*(max-1)/2);

    }
}
