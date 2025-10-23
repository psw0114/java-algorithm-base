package TwoPointers.test05;

import java.util.Scanner;

public class Main {

    private static int solution(int n){
        int answer = 0;
        int sum = 0;
        int lt = 0;
        int m = n/2+1;
        int[] arr = new int[m];

        for(int i =0; i<m; i++) {
            arr[i] = i+1;
        }

        for(int rt = 0; rt<m; rt++) {
            sum += arr[rt];

            if(sum == n) {
                answer++;
            }
            while(sum >= n) {
                sum -= arr[lt++];
                if(sum == n) {
                    answer++;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int answer = solution(n);
        System.out.println(answer);
    }
}
