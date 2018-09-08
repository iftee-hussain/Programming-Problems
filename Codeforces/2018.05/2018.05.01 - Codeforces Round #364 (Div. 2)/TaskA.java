package codes;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class TaskA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {

        int n = in.nextInt();

        int arr[] = new int[n];

        int brr[] = new int[101];

        int sum = 0 , c_sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
            sum += arr[i];



        }

        c_sum = sum / (n/2);


        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j <n ; j++) {
                if((arr[i] + arr[j] == c_sum) && brr[i]==0 && brr[j]==0){
                    out.println((i+1) +" "+ (j+1));
                    brr[i]++;
                    brr[j]++;
                    break;

                }
            }
        }
    }
}
