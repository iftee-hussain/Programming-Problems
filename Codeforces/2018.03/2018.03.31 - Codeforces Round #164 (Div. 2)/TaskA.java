package codes;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class TaskA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.nextInt();
        int [][] uni = new int[n][2];

        for(int i=0;i<n;++i){
            for(int j=0;j<2;++j){
                uni[i][j] = in.nextInt();
            }
        }
        int count = 0;
        for(int i=0;i<n;++i){
            int home = uni[i][0];
            for(int j=0;j<n;++j){
                if(i == j) continue;
                if(uni[j][1] == home)
                    count++;
            }
        }

        out.print(count);

    }
}
