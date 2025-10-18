package Array.test02;

import java.util.ArrayList;
import java.util.Scanner;

//보이는 학생
public class Main {

    public int solution(int[] arr) {
        int answer =1;
        int max = arr[0];

        for(int i =1; i<arr.length; i++){
            if(max < arr[i]){
                answer++;
                max =arr[i];
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for(int i =0; i <n; i++ ){
            arr[i] = scanner.nextInt();
        }

        int answer = main.solution(arr);
        System.out.print(answer);
    }
}

