package codes;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class TaskA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {

        int n = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();

        int count = 0;


            for (int j=b = 0; j>=1; j--) {

                for (int i = a ; i >= a  ; i++) {
                if(i+j ==n+1)
                    count++;
            }

        }
        out.print(count);


    }
}
