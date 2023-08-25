package Part1.String;

//대문자이면 소문자로, 소문자이면 대문자로 바꾼다.

import java.util.Scanner;

public class boj2744 {
    public static boolean IsCapital(char ch){
        if(Character.isUpperCase(ch)){
            return true;
        }
        return false;
    }
    public static String changeLetters(String str){
        StringBuilder sb = new StringBuilder();

        for(int i =0;i<str.length();i++){
            char letter = str.charAt(i);
            //대문자일 때
            if(IsCapital(letter)){
                sb.append(Character.toLowerCase(letter));
                continue;
            }
            //소문자일 때
            sb.append(Character.toUpperCase(letter));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String words = new String();
        String res = new String();
        words = sc.next();

        res = changeLetters(words);
        System.out.println(res);
    }
}
