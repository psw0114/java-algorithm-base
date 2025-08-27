package String.test02;

import java.util.Scanner;

/**
 * 아스키 넘버 범위
 * 대문자 65~90
 * 소문자 97~122
 */
public class Main2 {
    public String solution(String str){
        String answer="";
        for(char x : str.toCharArray()){
            if(x >=97 && x<= 122) {
                //소문자라면
                answer+= (char)(x-32);
            } else {
                //대문자라면
                answer+= (char)(x+32);
            }
        }
        return answer;
    }

    public static void main(String[] args){
        Main2 T = new Main2();
        Scanner kb = new Scanner(System.in);
        String str=kb.next();
        System.out.print(T.solution(str));
    }
}
