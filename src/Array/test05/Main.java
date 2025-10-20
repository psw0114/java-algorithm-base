package Array.test05;

import java.util.Scanner;

//소수(에라토스테네스 체)
public class Main {
    public int solution(int n) {
        int answer =0;
        int[] ch = new int[n+1];
        // 2부터 n까지 반복
        for(int i =2; i<=n; i++){
            if(ch[i]==0) {
                answer++;
                // 소수의 배수 제거
                for(int j=i; j<=n; j+=i){
                    ch[j] = 1;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int answer = main.solution(n);
        System.out.print(answer);
    }
}


