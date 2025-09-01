package String.test04;

import java.util.Scanner;

public class Main3 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < n; i++) {
            char[] charArr = sc.next().toCharArray();
            int left= 0, right = charArr.length -1;

            while(left<right) {
                char temp = charArr[left];
                charArr[left] = charArr[right];
                charArr[right] = temp;
                left++;
                right--;
            }
            System.out.println(String.valueOf(charArr));
        }
        sc.close();
    }
}
