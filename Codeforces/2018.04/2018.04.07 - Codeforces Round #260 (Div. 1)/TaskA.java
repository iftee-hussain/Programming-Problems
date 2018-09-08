package codes;

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.Arrays;

public class TaskA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.nextInt();
        BigInteger arr [] = new BigInteger[1000001];
        Arrays.fill(arr,BigInteger.ZERO);
        for(int i = 0; i< n ;i++)
        {
            int x = in.nextInt();
            arr[x] = arr[x].add(BigInteger.ONE);

        }
        BigInteger dp [] = new BigInteger[1000001];
        Arrays.fill(dp, BigInteger.ZERO);

        dp[0] = BigInteger.ZERO;
        dp[1] = new BigInteger(arr[1]+"");

        int max = 0;
        for (int i = 2;i<1000001; i++){
            BigInteger xx = new BigInteger(i+"").multiply(arr[i]);
            xx = xx.add(dp[i-2]);
            BigInteger yy = dp[i-1].max(xx);
            dp[i] = yy;
        }

        out.print(dp[1000001 -1]);
    }
}
