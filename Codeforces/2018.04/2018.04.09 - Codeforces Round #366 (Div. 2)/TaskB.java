package codes;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class TaskB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.nextInt();
        String a = "I love";
        String b = "I hate";
        String result = "";
        for(int i =0; i<n ;i++){
            if(i%2 == 1)
                result+= a;
            else
                result+=b;

            if(n>1 && i<n-1)
                result+= " that ";
        }
        result+= " it";

        out.print(result);
    }
}
