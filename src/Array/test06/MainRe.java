package Array.test06;

import java.util.ArrayList;
import java.util.Scanner;

public class MainRe {

    public static ArrayList<Integer> solution(int n,int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();

        for(int i =0; i<n; i++) {
            int tmp = arr[i];
            int res = 0;

            while(tmp > 0){ //123
                int t = tmp % 10;
                res = res * 10 + t;
                tmp = tmp/10;
            }

            if(isPrime(res)) {
                answer.add(res);
            }
        }

        return answer;
    }

    public static boolean isPrime(int n) {
        if(n <2 ) return false;
        for(int i = 2; i * i <=n; i++) {
            if(n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        ArrayList<Integer> answer = solution(n,arr);
        for (int i : answer) {
            System.out.print(i + " ");
        }
    }
}

