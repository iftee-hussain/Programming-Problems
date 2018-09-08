package codes;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class TaskA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.nextInt();
        int m = in.nextInt();

        int ccount = 0;
        int rcount = 1;

        for(int i = 0 ;i< n ;++i){
            boolean print = false;
            for (int j =0; j< m ;j++){
                if(rcount == 1 && j == m-1 && ccount  ==1  && (i+1)%2 == 0 && !print){
                    out.print("#");

                }
                else if(rcount == 1 && j == 0 && ccount  ==1 && (i+1)% 4 == 0 && !print){
                    out.print("#");
                    print = true;
                }

                  else if(ccount %2 == 1 && j == m-1 && rcount == 1 && (i+1)% 2 == 0 && !print)
                    out.print(".");
                else if( ccount %2 == 0)
                    out.print("#");
                else
                    out.print(".");
            }
            out.println();
            ccount++;
            if(ccount == 2){
                rcount = 0;
                ccount = 0;
            }else
                rcount = 1;

        }
    }
}
