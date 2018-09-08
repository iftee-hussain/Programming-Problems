package codes;

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class TaskA {
    static  int c = 1;


    static class Vertex{
        int index ;
        boolean root = false, visited = false;
        List<Vertex> adj = new ArrayList<>();
        Vertex(int index){
            this.index = index;
        }



    }

    public void dfs(Vertex u , int d){
        c = Math.max(c,d);
        for(int i = 0; i < u.adj.size(); i++)
        {

            dfs( u.adj.get(i) ,d+1);

        }
    }

    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.nextInt();

        Vertex [] va  = new Vertex[n];
        for (int i = 0; i < n; i++) {
            va[i] = new Vertex(i+1);
        }

        for (int i = 0; i < n; i++) {

            int x = in.nextInt();
            if(x == -1){

                continue;
            }

            else {
                va[x-1].adj.add(va[i]);
            }

        }
        for (int i = 0; i < n; i++) {
            dfs(va[i] , 1);
        }

        out.print(c);




    }
}
