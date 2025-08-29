package String.test03;

import java.util.Scanner;

public class Main2 {

    public String solution(String str) {
        String answer = "";
        int m = Integer.MIN_VALUE, pos;
        while((pos = str.indexOf(' '))!= -1) {
            String tmp = str.substring(0,pos);
            int len = tmp.length();
            if(len < m){
                m = len;
                answer =tmp;
            }
            //찾은 띄어쓰기 이후 문장으로 갱신
            str = str.substring(pos+1);
        }

        // 마지막 단어는 반복문에서 비교 불가
        if(str.length()>m) {
            answer = str;
        }
        return answer;
    }

    public static void main(String[] args) {
        Main2 T = new Main2();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(T.solution(str));
    }
}
