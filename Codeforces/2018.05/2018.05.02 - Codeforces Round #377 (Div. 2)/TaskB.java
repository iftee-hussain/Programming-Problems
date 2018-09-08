package codes;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class TaskB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.nextInt();
        int k = in.nextInt();

        int a [] = new int[n];

        int sum = 0;

        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
            sum += a[i];
        }

        int dsum = 0, res = 0;
        for (int i = 0; i < n; i++) {

          if(i==0){
              dsum += a[i];
              continue;

          }

          else {
              dsum += a[i];
              if(dsum >= k){
                  dsum = a[i];
                  continue;
              }

              else{
                  int x = k -dsum ;
                  res+= x;

                  a[i] = a[i] + x;

                  dsum = a[i];
              }
          }

        }
        out.println(res);
        for (int i = 0; i < n; i++) {
            out.print(a[i] + " ");
        }


    }
}
