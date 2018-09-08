package codes;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class TaskA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.nextInt();
        int m = in.nextInt();
        boolean found = false;
        if(n <m )
            out.print(-1);
        else{
            int steps;
            if(n%2 == 0){
                 steps =  n/2;
                while(steps<=n){
                    if(steps %m == 0){
                        found = true;
                        break;
                    }
                    steps++;
                }
                if(found)
                out.print(steps);

            }else{
                n++;
                 steps =  n/2;
                while(steps<=n){
                    if(steps %m == 0){
                        found = true;
                        break;
                    }
                    steps++;
                }
                if(found)
                out.print(steps);
            }
            if(!found)
                out.print(-1);

        }

    }
}
