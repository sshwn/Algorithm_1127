package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q_11720 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String x = br.readLine();
        int sum = 0;
        for(int i=0; i<x.length(); i++) {
            sum += x.charAt(i) - '0';
        }
        System.out.println(sum);

    }
}
