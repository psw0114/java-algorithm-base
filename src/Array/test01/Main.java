package Array.test01;

import java.util.ArrayList;
import java.util.Scanner;

//큰 수 출력하기
public class Main {

    public ArrayList<Integer> solution(int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(arr[0]);
        for(int i =1; i < arr.length; i++) {
            if(arr[i-1] <arr[i]) {
                answer.add(arr[i]);
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

        ArrayList<Integer> answer = main.solution(arr);
        for(int x : answer){
            System.out.print(x+" ");
        }
    }
}

