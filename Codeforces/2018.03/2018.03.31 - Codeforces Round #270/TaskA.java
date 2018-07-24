package codes;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class TaskA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n;
        n=in.nextInt();
        for(int i=3;i<n;i++)
        {

            boolean flag=isPrime(i);
            if(flag==false)
            {

                int y=n-i;
                flag=isPrime(y);
                if(flag==false)
                {
                    out.print(i+" "+y);
                    break;

                }
            }

        }
    }
    private boolean isPrime(int num) {
        if (num < 2) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;
        for (int i = 3; i * i <= num; i += 2)
            if (num % i == 0) return false;
        return true;
    }


}
