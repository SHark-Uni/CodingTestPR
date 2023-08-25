package Part1.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj1543 {
    static String target = new String();
    static String str = new String();
    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        target = br.readLine();
        str = br.readLine();
    }
    static boolean outOfRange(int idx){
        return idx+str.length() > target.length();
    }
    static boolean IsSame(int st){
        int end = st+str.length();
        String subTarget = target.substring(st,end);
        return subTarget.equals(str);
    }

    static void solve(){
        int cnt = 0;
        int st =0;
        while(st<target.length()){
            if(outOfRange(st)){
                break;
            }
            if(IsSame(st)){
                st+=str.length();
                cnt++;
                continue;
            }
            st++;
        }
        System.out.println(cnt);
    }
    public static void main(String[] args) throws IOException {
        input();
        solve();
    }
}
