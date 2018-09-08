package codes;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class TaskA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int arr [] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        int n = in.nextInt();
        int [] inputArray = in.nextIntArray(n);

        if(n ==1){
            if(inputArray[0] == 0)
                out.print("UP");

            else if(inputArray[0] == 15)
                out.print("DOWN");

            else
                out.print(-1);
        }else{

            int last = inputArray[inputArray.length-1];
            int last_b = inputArray[inputArray.length-2];
            int diff =  last - last_b;
            if(last == 0)
                out.print("UP");

            else if(last == 15)
                out.print("DOWN");

            else if(last == 0 && last_b == 1)
                out.print("UP");
            else if(diff == -1 && last >= 1)
                out.print("DOWN");

            else if(diff == 1 && last < 15 )
                out.print("UP");

        }
    }
}
