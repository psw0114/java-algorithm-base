package TwoPointers.test01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//두 배열 합치기
//

/**
 * while 문 안에 else if문은 없어도 돌아감
 * else if 없으면 `arr1[lt] == arr2[rt]` 인 경우 else로 넘어가고
 * arr2 의 값만 증가하고 arr1의 포언터는 그대로 남아서
 * 다음 반복에서 arr1은 여전히 같거나 작게된다
 * 결국 arr1은 언젠가 if(arr1[lt] < arr2[rt])를 만나서 값을 추가하고 증가하게 된다
 *
 *  실제 결과 배열의 내용은 같고 성능차이도 없을것. 가독성을 위해서 중가 else if를 넣냐 마냐 취향차이
 */

public class Main {

    public static ArrayList<Integer> solution(int n, int m, int[] arr1, int[] arr2) {
        ArrayList answer = new ArrayList<Integer>();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int lt = 0;
        int rt = 0;

        while(lt < n && rt < m) {
            if(arr1[lt] < arr2[rt]) {
                answer.add(arr1[lt++]);
            } else if(arr1[lt] == arr2[rt]){
                answer.add(arr1[lt++]);
                answer.add(arr2[rt++]);
            } else {
                answer.add(arr2[rt++]);
            }
        }

        while(lt<n) {
            answer.add(arr1[lt++]);
        }
        while(rt<m) {
            answer.add(arr2[rt++]);
        }

        return answer;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for(int i = 0; i<n; i++) {
            arr1[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] arr2 = new int[m];
        for(int i = 0; i<m; i++) {
            arr2[i] = sc.nextInt();
        }

        ArrayList<Integer> answer =solution(n,m,arr1,arr2);
        for(int i : answer) {
            System.out.print(i + " ");
        }
    }
}