package codes;

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.Arrays;
import java.util.Comparator;

public class TaskB {

    int hc = 0, lc = 0;

    public int binarySearch(int [] a , int low, int high, int key){
        int mid = (low + high) /2;

        while (mid<=high){

            int midVal = a[mid];

           if(midVal >key){
               if(mid - 1 <0 ) break;
              mid = mid-1;
              lc = 1;
               if(lc ==1 && hc ==1 )
                   return mid +1;

            }
            else if(midVal<=key){
               if(mid+1 >= a.length) return mid+1;
                mid = mid +1;
                hc = 1;

            }

        }
        return 0;
    }
    public static int upper_bound(Comparable[] arr, Comparable key) {
        int len = arr.length;
        int lo = 0;
        int hi = len-1;
        int mid = (lo + hi)/2;
        while (true) {
            int cmp = arr[mid].compareTo(key);
            if (cmp == 0 || cmp < 0) {
                lo = mid+1;
                if (hi < lo)
                    return mid<len-1?mid+1:-1;
            } else {
                hi = mid-1;
                if (hi < lo)
                    return mid;
            }
            mid = (lo + hi)/2;
        }
    }

    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.nextInt();
        Integer arr [] = new Integer[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        Arrays.sort(arr);

        int m = in.nextInt();
        int brr [] = new int[m];

        for (int i = 0; i < m; i++) {
            brr[i] = in.nextInt();
            /*int x = upper_bound(arr,brr[i]);
            if(x<0) out.println(arr.length);
            else
                out.println(x);*/
            int x = Arrays.binarySearch(arr,brr[i], new IntegerComparator());
            ++x;
            if(x<0)
                x=x*(-1);
            out.println(x);
            lc = hc = 0;
        }

    }

    class IntegerComparator implements Comparator<Integer> {

        @Override
        public int compare(Integer o1, Integer o2) {
            return o1 - o2;
        }
    }
}
