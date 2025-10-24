package String.test06;
// 중복 문자 제거

import java.util.Scanner;

public class Main {

    public static String solution(String str) {
        String answer = "";
        char[] arr = str.toCharArray();

        for(int i = 0; i<arr.length; i++) {
            int index = str.indexOf(arr[i]);
            if(index == i) {
                answer += arr[i];
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String answer = solution(str);
        System.out.println(answer);
    }
}
