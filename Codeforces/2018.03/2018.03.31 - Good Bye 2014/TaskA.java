package codes;

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.*;

public class TaskA {
    static class Vertex{
        List<Vertex> vertices = new ArrayList<>();
        int index;
        Vertex(int index){
            this.index = index;
        }

    }
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.nextInt();
        int t = in.nextInt();
        Vertex src = null;
        HashMap<Integer,Vertex> map = new HashMap<>();
        for(int i =0; i<n-1 ; ++i){
            int a = in.nextInt();
            Vertex aa = null;
            if(map.get(i+1) == null){
                aa =  new Vertex(i+1);
                map.put(i+1, aa);
            }
            else
                aa = map.get(i+1);

            Vertex bb = null;
            if(map.get(i+1+a) == null){
                bb =  new Vertex(i+1+a);;
                map.put(i+1+a, bb);
            }
              else
                bb = map.get(i+1+a);

            aa.vertices.add(bb);
            bb.vertices.add(aa);

            if(i==0)
                src = aa;
        }

        boolean res = dfs(src, n, t);
        if(res)
            out.print("YES");
        else
            out.print("NO");

    }

    private boolean dfs(Vertex src, int n, int t) {
        boolean [] visited = new boolean[n+1];
        Arrays.fill(visited, false);
        Stack<Vertex> stack = new Stack<>();
        stack.add(src);
        visited[src.index] = true;
        boolean loop = true;
        while(!stack.empty()){
            Vertex v = stack.pop();

            List<Vertex> list = v.vertices;
            for(int i = 0 ; i< list.size(); ++i){
                Vertex u = list.get(i);

                if(!visited[u.index])
                    stack.add(u);
                System.out.println(u.index);
                visited[u.index] = true;

            }

        }
        if(visited[t])
            return true;
        else
            return false;

    }
}
