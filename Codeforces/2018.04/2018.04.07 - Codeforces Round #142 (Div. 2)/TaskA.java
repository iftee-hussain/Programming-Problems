package codes;

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.Arrays;

public class TaskA {
    int [] b;
    void insertionSort(int arr[], int n)
    {
        int i, key, j,k;
        for (i = 1; i < n; i++)
        {
            key = arr[i];
            k=b[i];
            j = i-1;

            while (j >= 0 && arr[j] > key)
            {
                arr[j+1] = arr[j];

                b[j+1]=b[j];
                j = j-1;
            }
            arr[j+1] = key;
            b[j+1]=k;
        }

    }
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int s = in.nextInt();
        int n = in.nextInt();

        int [] arr = new int[n];
        b = new int [n];

        for (int i = 0 ;i<n ; i++){
            arr[i] = in.nextInt();
            b[i] = in.nextInt();
        }
        insertionSort(arr, n);
        boolean res = true;
        for (int i=0; i<n; i++)
        {
            if ( s>arr[i])
            {
                s+=b[i];
            }
            else {
               res= false;
               break;
            }
        }
       if(res)
           out.print("YES");
        else
           out.print("NO");


    }
}
