package codes;

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class TaskA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.nextInt();
        int arr [] = new int[n];
        int arr1 [] = new int[3];
        HashMap<Integer,ArrayList<Integer>> map = new HashMap<>();
        Arrays.fill(arr1,0);

        for(int i=0;i<n;i++){
            arr[i] = in.nextInt();
            if(map.get(arr[i]) == null){
                ArrayList<Integer> x  = new ArrayList();
                x.add(i+1);
                map.put(arr[i], x);
            }
            else{
                map.get(arr[i]).add(i+1);
            }
           ++arr1[arr[i]-1];
        }
        Arrays.sort(arr1);
        int res = arr1[0];
        out.println(res);
        if(res>0){
            for(int i = 0 ; i< res; i++){

                out.print(map.get(1).get(i) +" ");
                out.print(map.get(2).get(i) +" ");
                out.print(map.get(3).get(i));

                out.println();
            }


        }


    }
}
