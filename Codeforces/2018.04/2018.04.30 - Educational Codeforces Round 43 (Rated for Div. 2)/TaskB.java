package codes;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class TaskB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.nextInt();
        int m = in.nextInt();

        long k = in.nextLong();

        long val =1;

        if(k>(long)n*m){
            k = k - (n*m);
        }

        if( k < n){
            out.print(k+1 + " "+1);
        }
        else {
            boolean found= false;
            boolean right = true;

            int min = n;
            int max = n + m-2;

            while (!found){


                if(k>=min && k<=max){
                    out.print(n + " "+(1+(k-min)));
                    found = true;

                }
                min = max +1;
                int temp = max;
                max = temp + m-1;
                n--;



            }



        }



    }
}
