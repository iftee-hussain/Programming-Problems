package codes;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class TaskB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.nextInt();
        int l = n*2 +1;

        String [] pri = new String[(n*2 +1)/2 +1];
        for (int i = 0; i <= l/2; i++) {
            int row = i;
            String s= "";


                for (int k = 0; k < l/2 -i; k++) {
                    //out.print("  ");
                    s += "  ";
                }
                int print = 0;

                int aa [] = new int [row+1];
                for (int kk = 0; kk <= row; kk++) {
                   // out.print(print+" ");
                    s += print;
                    if(row > kk)
                        s += " ";
                    aa[kk] = print;
                    print++;

                }
                String ss = "";
            for (int ll = row-1; ll>=0  ; ll--) {
                ss += " "+ aa[ll];

            }
            s += ss;
               out.print(s);
               pri[i] = s;


            out.println();
        }
        for (int i = pri.length-2; i >=0 ; i--) {
            out.print(pri[i]);
            out.println();
        }

    }
}
