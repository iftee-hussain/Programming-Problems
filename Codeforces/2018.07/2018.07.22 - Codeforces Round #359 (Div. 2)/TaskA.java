package codes;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class TaskA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.nextInt(), m = in.nextInt();

        long total = m, distress = 0;
        for (int i = 0; i < n; i++) {
            String s = in.readLine();
            String [] ins = s.split(" ");
           // out.println(ins[0]);
           // out.println(ins[1]);
            if(ins[0].equals("+")) total += Long.parseLong(ins[1]);
            else{
                long get = Long.parseLong(ins[1]);
                if(get<=total) total-= get;
                else distress++;
            }
        }
        out.print(total +" "+distress);
    }
}
