package Array.test03;

import java.util.Scanner;

public class Main {

    public String solution(int[] a_arr, int[] b_arr) {

      String answer = "";

        for(int i = 0; i< a_arr.length; i++) {
            if(a_arr[i] == 1 && b_arr[i] == 3){
                answer+="A";
            } else if (a_arr[i] == 2 && b_arr[i] == 1) {
                answer+="A";
            } else if (a_arr[i] == 3 && b_arr[i] == 2) {
                answer+="A";
            } else if(a_arr[i] == b_arr[i]) {
                answer+="D";
            } else {
                answer+="B";
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a_arr[] = new int[n];
        int b_arr[] = new int[n];
        for(int i =0; i <n; i++ ){
            a_arr[i] = scanner.nextInt();
        }
        for(int i =0; i <n; i++ ){
            b_arr[i] = scanner.nextInt();
        }
        for(char x:  main.solution(a_arr, b_arr).toCharArray()){
            System.out.println(x);
        }
    }
}

