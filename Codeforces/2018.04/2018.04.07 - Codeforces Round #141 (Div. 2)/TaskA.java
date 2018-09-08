package codes;

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.HashSet;
import java.util.Set;

public class TaskA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int size = in.nextInt();
        String text = in.readLine().toLowerCase();
        Set<Integer> alphabetsCheck = new HashSet<>(26);
        int counter = 0;
        for (char c : text.toCharArray()) {
            int value = c - 'a';
            if (alphabetsCheck.add(value)) {
                counter++;
            }
            if (counter == 26) {
                break;
            }
        }
        if (counter==26) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
