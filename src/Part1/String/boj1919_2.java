package Part1.String;

import java.util.Scanner;

public class boj1919_2 {
    static String A = new String();
    static String B = new String();
    static int[] Alphabet = new int[26];
    static int[] Blphabet = new int[26];
    static void input(){
        Scanner sc = new Scanner(System.in);
        A = sc.next();
        B = sc.next();
    }
    static void GetAlphabet(){
        for(int i=0;i<A.length();i++){
            int idx = A.charAt(i)-'a';
            Alphabet[idx]++;
        }
        for(int i=0;i<B.length();i++){
            int idx = B.charAt(i)-'a';
            Blphabet[idx]++;
        }
    }
    static void solve(){
        int cnt = 0;
        GetAlphabet();
        for(int i=0;i<26;i++){
            cnt+=Math.abs(Alphabet[i] - Blphabet[i]);
        }
        System.out.println(cnt);
    }
    public static void main(String[] args) {
        input();
        solve();
    }
}
