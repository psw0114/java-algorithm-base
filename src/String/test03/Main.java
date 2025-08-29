package String.test03;

import java.util.Scanner;

public class Main {

    public String solution(String str) {
        String answer = "";
        int m = Integer.MIN_VALUE;
        String[] s = str.split(" ");
        // str= "it is time to study"
        // s =["it","is","time","to", "study"]

        for(String x : s) {
            int len = x.length();
            if(m < len) {
                m = len;
                answer = x;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(T.solution(str));
    }
}
