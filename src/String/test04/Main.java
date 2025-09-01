package String.test04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public List<String> solution (int n, String[] strArr) {
        List<String> answer = new ArrayList<>();
        for (String str :  strArr){
            StringBuilder newStr = new StringBuilder(str);
            answer.add(String.valueOf(newStr.reverse()));
        }
        return answer;
    }

    public static void main(String[] args){
        Main m = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] strArr = new String[n];
        for(int i = 0; i<n; i++) {
            strArr[i] = sc.next();
        }
        List<String> answer = m.solution(n, strArr);
        for(String str : answer) {
            System.out.println(str);
        }
    }
}
