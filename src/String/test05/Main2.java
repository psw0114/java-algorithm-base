package String.test05;

import java.util.Scanner;

public class Main2 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String src = sc.nextLine();
        char[] charArr = src.toCharArray();
        int lt= 0, rt= charArr.length-1;

        while(lt < rt) {
            if(!isAlphabet(charArr[lt])) {
                lt++;
            }else if (!isAlphabet(charArr[rt])){
                rt--;
            }else {
                char temp = charArr[lt];
                charArr[lt] = charArr[rt];
                charArr[rt] = temp;
                lt++;
                rt--;
            }
        }
        System.out.println(String.valueOf(charArr));
    }

    private static boolean isAlphabet(char c) {
        return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z');
    }
}
