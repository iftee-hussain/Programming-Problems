package codes;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class TaskA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.nextInt();
        int h = in.nextInt();


        int sum = 0 ;
        for(int i = 0 ; i< n ; ++i){
            int x =  in.nextInt();
            if(x > h){
                sum+=2;
            }
            else
                sum+= 1;
        }
        out.print(sum);

    }
}
