package codes;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class TaskA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n, t, a = 1;
         n =in.nextInt();
         t = in.nextInt();

        if(t==10){
            if(n==1){
                out.print(-1);
            }
            else{
                for(int i=0;i<n-1;i++){
                    out.print(1);
                }
                out.println(0);
            }
        }
        else{
            for(int i=0;i<n;i++){
                out.print(t);
            }
            out.println();
        }
    }
}
