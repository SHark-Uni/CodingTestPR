package Part1.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj1157 {
    static int[] alphabet = new int[26];
    static String word = new String();
    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        word = br.readLine().toUpperCase();
    }
    static void getAlphabet(){
        for(int i=0;i<word.length();i++){
            int idx = word.charAt(i) - 'A';
            alphabet[idx]++;
        }
    }
    static void solve(){
        Pair p = new Pair(0,0);
        for(int i=0;i<26;i++){
            //같은 경우
            if (p.value !=0 && (p.value==alphabet[i])){
                p.idx = 999;
                continue;
            }
            if(alphabet[i]>p.value){
                p.value = alphabet[i];
                p.idx = i;
            }
        }
        if(p.idx==999){
            System.out.println("?");
            return;
        }
        char res = (char)(p.idx+'A');
        System.out.println(res);
    }
    public static void main(String[] args)  throws IOException {
        input();
        getAlphabet();
        solve();
    }
}

class Pair{
    int idx;
    int value;
    Pair(int idx,int value){
        this.idx = idx;
        this.value = value;
    }
}