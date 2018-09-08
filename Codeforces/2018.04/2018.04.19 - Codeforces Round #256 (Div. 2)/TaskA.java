package codes;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class TaskA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {

        int arr_cups [] =new int[3];
        int cup_sum = 0;
        for(int i = 0; i< 3 ;i++){
            arr_cups[i] = in.nextInt();
            cup_sum += arr_cups[i];
        }

        int arr_med [] =new int[3];
        int med_sum = 0;
        for(int i = 0; i< 3 ;i++){
            arr_med[i] = in.nextInt();
            med_sum += arr_med[i];
        }

        int n = in.nextInt();

        int cups_s = (cup_sum + 4) /5;
        int med_s = (med_sum + 9) /10;

        if(cups_s + med_s > n)
            out.print("NO");
        else
            out.print("YES");



    }
}
