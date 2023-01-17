package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class BOJ2810 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();
        int idx = 0, count = 1;
        while (idx<n) {
            char type = str.charAt(idx);
            if (type == 'S')
                count++;
            else if(type == 'L') {
                idx++;
                count++;
            }
            idx++;
        }
        if (count > n)
            System.out.println(n);
        else
            System.out.println(count);
    }
}

/*
PYTHON : 통과 64ms
import collections
import sys
input = sys.stdin.readline
n = int(input())
s = input().rstrip()
cupholders, i = 1, 0
single, couple = 0, 0
while i != len(s) :
    if s[i] == 'S' :
        single += 1
        i += 1
    elif s[i] == 'L' :
        couple += 2
        i += 2
    cupholders += 1

ans = single + couple
if cupholders >= ans :
    print(ans)
else :
    print(cupholders)

JAVA : 시간 초과 (TLE)
 * package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class BOJ2810 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();
        int cupholders = 1, i = 0;
        int single = 0, couple = 0;
        while (i != str.length()) {
            for(int j = 0; j < str.length(); j++) {
                if(str.charAt(j) == 'S') {
                    single++;
                    i++;
                }
                else if(str.charAt(j) == 'L') {
                    couple += 2;
                    i += 2;
                }
                cupholders++;
            }
        }
        int ans = single + couple;
        if (cupholders >= ans)
            System.out.println(ans);
        else
            System.out.println(cupholders);
    }
}

 */