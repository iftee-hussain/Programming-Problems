package codes;
//TLE
//UNSOLVED
import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.Arrays;

public class TaskA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.nextInt();
        int [] cuts = new int[3];

        for(int i=0; i<3 ; i++){
            cuts[i] = in.nextInt();
        }
        Arrays.sort(cuts);

        int max = 0 ;

        for (int i = 0 ; i <=n; i++){
            for(int j = 0; j<= n; j++){
                for(int k = 0 ; k<=n ;k++){
                    int res = (i*cuts[0]) + (j*cuts[1])+ (k*cuts[2]);
                    if(res == n){
                        if(max < i+j+k)
                            max = i+j+k;
                    }
                }
            }
        }
        out.print(max);

    }
}
