package codes;

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Task {
    static class Point2D{
        int x ,y;
        Point2D(int x, int y){
            this.x =x;
            this.y =y;
        }

    }
    public int checkSameLine(Point2D a, Point2D b)
    {
        double m1 = (a.y - 0)  / (a.x -0);
        double m2 = (b.y - 0) / (b.x -0);
        if(m1 == m2) return 1;
        return 0;
    }


    public int solution(Point2D[] A) {
        ArrayList<Point2D> f_co = new ArrayList<>();
        ArrayList<Point2D> s_co = new ArrayList<>();
        ArrayList<Point2D> t_co = new ArrayList<>();
        ArrayList<Point2D> fo_co = new ArrayList<>();
        ArrayList<Point2D> on_axis = new ArrayList<>();

        for (int i = 0; i < A.length; i++) {
            if(A[i].x >0 && A[i].y > 0)  f_co.add(A[i]);
            else if(A[i].x <0 && A[i].y > 0) s_co.add(A[i]);
            else if(A[i].x <0 && A[i].y < 0) t_co.add(A[i]);
            else if(A[i].x >0 && A[i].y < 0) fo_co.add(A[i]);
            else if(A[i].x ==0 || A[i].y == 0) on_axis.add(A[i]);

        }
        int count = 0;
        if(f_co.size() >0){
            if(f_co.size() == 1)
                count++;
            else {
                HashMap<Point2D,Boolean> map = new HashMap<Point2D, Boolean>();

                for (int i = 0; i < f_co.size() -1; i++) {
                    for (int j = 1; j <f_co.size(); j++) {
                        int res = checkSameLine(f_co.get(i), f_co.get(j));

                        if(map.get(f_co.get(i)) == null && map.get(f_co.get(j)) == null && res == 1)
                            count +=res;

                        if(res == 1){
                            map.put(f_co.get(i),true);
                            map.put(f_co.get(j), true);
                        }

                    }
                }
            }
        }

        if(s_co.size() >0){
            if(s_co.size() == 1)
                count++;
            else {
                HashMap<Point2D,Boolean> map = new HashMap<Point2D, Boolean>();
                for (int i = 0; i < s_co.size() -1; i++) {
                    for (int j = 1; j <s_co.size(); j++) {
                        int res = checkSameLine(s_co.get(i), s_co.get(j));

                        if(map.get(s_co.get(i)) == null && map.get(s_co.get(j)) == null && res == 1)
                            count +=res;

                        if(res == 1){
                            map.put(s_co.get(i),true);
                            map.put(s_co.get(j), true);
                        }

                    }
                }
            }
        }

        if(t_co.size() >0){
            if(t_co.size() == 1)
                count++;
            else {
                HashMap<Point2D,Boolean> map = new HashMap<Point2D, Boolean>();
                for (int i = 0; i < t_co.size() -1; i++) {
                    for (int j = 1; j <t_co.size(); j++) {
                        int res = checkSameLine(t_co.get(i), t_co.get(j));

                        if(map.get(t_co.get(i)) == null && map.get(t_co.get(j)) == null && res == 1)
                            count +=res;

                        if(res == 1){
                            map.put(t_co.get(i),true);
                            map.put(t_co.get(j), true);
                        }
                    }
                }
            }
        }

        if(fo_co.size() >0){
            if(fo_co.size() == 1)
                count++;
            else {
                HashMap<Point2D,Boolean> map = new HashMap<Point2D, Boolean>();

                for (int i = 0; i < fo_co.size() -1; i++) {
                    for (int j = 1; j <fo_co.size(); j++) {
                        int res = checkSameLine(fo_co.get(i), fo_co.get(j));

                        if(map.get(fo_co.get(i)) == null && map.get(fo_co.get(j)) == null && res == 1)
                            count +=res;

                        if(res == 1){
                            map.put(fo_co.get(i),true);
                            map.put(fo_co.get(j), true);
                        }
                    }
                }
            }
        }

        if(on_axis.size()>0){
            if(on_axis.size() == 1)
                count++;
            else {
                HashMap<Point2D,Boolean> map = new HashMap<Point2D, Boolean>();
                for (int i = 0; i < on_axis.size() -1; i++) {
                    for (int j = 1; j <on_axis.size(); j++) {
                        int res = checkSameLine(on_axis.get(i), on_axis.get(j));

                        if(map.get(on_axis.get(i)) == null && map.get(on_axis.get(j)) == null && res == 1 )
                            count +=res;

                        if(res == 1){
                            map.put(on_axis.get(i),true);
                            map.put(on_axis.get(j), true);
                        }
                    }
                }
            }
        }



        return count;
    }
    public void solve(int testNumber, InputReader in, OutputWriter out) {
      int [] a = in.nextIntArray(10);
      Point2D[] aa = new Point2D[5];
      int j =0;
        for (int i = 0; i < 5; i++) {
            aa[i] = new Point2D(a[j], a[j+1]);
            j+=2;
        }
        out.print(solution(aa));
    }
}
