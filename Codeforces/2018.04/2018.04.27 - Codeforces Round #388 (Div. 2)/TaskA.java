package codes;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class TaskA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.nextInt();

        if( n%2 == 0){
            out.println(n/2);
            for (int i = 0; i < n/2; i++) {
                out.print(2 + " ");

            }
        }else{
            out.println((n-1)/2 );
            for (int i = 0; i < (n-1)/2 -1; i++) {
                out.print(2 + " ");
            }
            out.print(3);
        }
    }
}
