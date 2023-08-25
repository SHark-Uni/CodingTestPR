package Part1.String;

import java.util.ArrayList;
import java.util.Scanner;

public class boj1919 {
    static String A = new String();
    static String B = new String();
    static int[] Alphabet = new int[26];
    //문자열 맵핑
    static void input(){
        Scanner sc = new Scanner(System.in);
        A = sc.next();
        B = sc.next();
    }
    static void GetAlphabet(){
        for(int i=0;i<A.length();i++){
            int idx = A.charAt(i)-97;
            Alphabet[idx]++;
        }
    }
    static void solve(){
        int cnt = 0;
        GetAlphabet();
        for(int i=0;i<B.length();i++){
            int idx =  B.charAt(i)-97;
            if(Alphabet[idx]==0){
                cnt+=2;
            }
        }
        System.out.println(cnt);
    }
    public static void main(String[] args) {
        input();
        solve();
    }
}
