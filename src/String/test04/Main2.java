package String.test04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main2 {

    public List<String> solution (String[] strArr) {
        List<String> answer = new ArrayList<>();
        for(String str : strArr ){
            char[] charArr = str.toCharArray();
            int lt=0, rt = charArr.length-1;
            // 문자열 자리 교환 ['g','o','o','d'] -> ['d','o','o','g']
            while(lt < rt) {
                char temp = charArr[lt];
                charArr[lt] = charArr[rt];
                charArr[rt] = temp;
                lt++;
                rt--;
            }

            answer.add(String.valueOf(charArr));
        }
        return answer;
    }

    public static void main(String[] args){
        Main2 m = new Main2();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] strArr = new String[n];
        for(int i = 0; i<n; i++) {
            strArr[i] = sc.next();
        }
        List<String> answer = m.solution(strArr);
        for(String str : answer) {
            System.out.println(str);
        }
        sc.close();
    }
}
