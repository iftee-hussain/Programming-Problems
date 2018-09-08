package codes;

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.ArrayList;
import java.util.Collections;

public class TaskC {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.nextInt();
        int m = in.nextInt();

        int tetris[][] = new int[m][n];
        ArrayList<Integer> cnt = new ArrayList<>();
        for(int i =0; i< n; i++)
            cnt.add(0);

        for (int i = 0; i < m; ++i) {
            int col = in.nextInt();
            int x = cnt.get(col-1);
            cnt.set(col-1, ++x);

        }
        Collections.sort(cnt);
        out.print(cnt.get(0));



       /* for (int i = 0; i < m; i++) {
            int x = in.nextInt();

            for (int jj = 0; jj < n && x > 0; jj++) {
                for (int ii = 0; ii < m; ii++) {
                    if (tetris[ii][jj] == 1)
                        continue;
                    else {
                        tetris[ii][jj] = 1;
                        x--;

                        break;
                    }

                }
            }

        }

        int sum = 0;

        for (int ii = 0; ii < m; ii++) {
            int count = 0;
            for (int jj = 0; jj < n; jj++) {
                if (tetris[ii][jj] == 1) {
                    count++;
                    if (count == n)
                        sum++;
                }

            }

        }
        out.print(sum);*/
    }
}
