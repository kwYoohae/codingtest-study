package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ5585 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int money = 1000 - n;
        int[] arr = {500,100,50,10,5,1};
        int ans = 0;
        int temp = 0;
        for(int i = 0; i < arr.length; i++) {
            temp = money / arr[i];
            if (temp > 0) {
                ans += temp;
                money %= arr[i];
            }
        }
    System.out.println(ans);
    }
}
