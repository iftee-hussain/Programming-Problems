package codes;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class TaskA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.nextInt();

        int arr [][] = new int[n+1][n+1];

        int max = 1;
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n;j++){

                if(i == 1)
                    arr[i][j] = 1;
                else if(j==1)
                    arr[i][j] =1;
                else{

                    arr[i][j] = arr[i-1][j] + arr[i][j-1];
                    if(arr[i][j] > max)
                        max = arr[i][j];
                }


            }
        }

        out.print(max);
    }
}
