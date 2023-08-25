package Part1.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.annotation.Target;
import java.util.StringTokenizer;

public class boj13223 {
    static int curHour = 0;
    static int curMinute=0;
    static int curSecond = 0;
    static int targetHour = 0;
    static int targetMinute=0;
    static int targetSecond =0;

    static int resultSecond =0;
    static int resultMinute = 0;
    static int resultHour =0;
    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer current = new StringTokenizer(br.readLine(),":");
        StringTokenizer target = new StringTokenizer(br.readLine(),":");

        curHour = Integer.parseInt(current.nextToken());
        curMinute = Integer.parseInt(current.nextToken());
        curSecond = Integer.parseInt(current.nextToken());

        targetHour = Integer.parseInt(target.nextToken());
        targetMinute = Integer.parseInt(target.nextToken());
        targetSecond = Integer.parseInt(target.nextToken());
    }
    static boolean IsNegative(int a,int b){
        return (b-a) <0;
    }

    static void calculateSeconds(){
        //내림해야하는 경우
        if(IsNegative(curSecond,targetSecond)){
            //만약, 00분이라면?
            if(targetMinute == 0){
                targetHour -=1;
                targetMinute +=60;
            }
            targetMinute -=1;
            resultSecond = (targetSecond +60) -curSecond;
            return;
        }
        resultSecond = targetSecond- curSecond;
    }
    static void calculateMinutes(){
        if(IsNegative(curMinute,targetMinute)){
            //만약, 00시라면?
            if(targetHour == 0){
                targetHour +=24;
            }
            targetHour -=1;
            resultMinute = (targetMinute +60) -curMinute;
            return;
        }
        resultMinute = targetMinute - curMinute;
    }
    static void calculateHours(){
        if(IsNegative(curHour,targetHour)){
            resultHour = (targetHour + 24) - curHour;
            return;
        }
        resultHour = (targetHour) -curHour;
    }
    static void printDigit(){
        StringBuilder sb = new StringBuilder();
        if(resultHour>=0 && resultHour<10){
            sb.append(0).append(resultHour);
        }else{//10시 이상일 때
            sb.append(resultHour);
        }
        sb.append(':');
        if(resultMinute>=0 && resultMinute<10){
            sb.append(0).append(resultMinute);
        }else{
            sb.append(resultMinute);
        }
        sb.append(':');
        if(resultSecond>=0 && resultSecond<10){
            sb.append(0).append(resultSecond);
        }else{
            sb.append(resultSecond);
        }
        System.out.println(sb);
    }
    static void calculateTime(){
        calculateSeconds();
        calculateMinutes();
        calculateHours();

        printDigit();
    }
    public static void main(String[] args) throws IOException {
        input();
        calculateTime();
    }
}
