package codes;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class TaskA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.nextInt();
        int m = n;
        int k = in.nextInt();
        int minutes = 4*60 -1;

        int canSpend = minutes -k + 1;
        int count = 1;
        while(n-- > 0 ){
            canSpend -= count * 5;
           // out.println("* " + canSpend);
            if(canSpend - (count+1)*5 >= 0){


                count++;
            }

            else
                break;

        }
        if(canSpend<0)
            out.print(0);
        else if(count > m)
             out.print(m);
        else
            out.print(count);

    }


}
