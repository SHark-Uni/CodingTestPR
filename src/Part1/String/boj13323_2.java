package Part1.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj13323_2 {
    static int[] current = new int[3];
    static int[] target = new int[3];
    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String a = br.readLine();
        String b = br.readLine();

        String[] cur = a.split(":");
        String[] tg = b.split(":");


        for(int i=0;i<cur.length;i++){
            current[i]=Integer.parseInt(cur[i]);
        }
        for(int i=0;i<tg.length;i++){
            target[i]=Integer.parseInt(tg[i]);
        }
    }
    static void solve(){
        int curTime = (60*current[0] + current[1])*60 +current[2];
        int tarTime = (60*+target[0]+target[1])*60 + target[2];

        //현재시간이 더 크다면?
        int resTime = curTime>=tarTime ? 86400 +tarTime - curTime: tarTime-curTime;
        int[] printDigit = new int[3];
        //초
        printDigit[2] = resTime%60;
        resTime /= 60;
        //분
        printDigit[1]= resTime%60;
        resTime /= 60;
        //시
        printDigit[0] = resTime;

        System.out.printf("%02d:%02d:%02d", printDigit[0], printDigit[1], printDigit[2]);
    }
    public static void main(String[] args) throws IOException {
        input();
        solve();
    }
}
