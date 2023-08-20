package PracticeTasks;

import java.util.Scanner;

public class PolindromeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int num=sc.nextInt();
        System.out.println("Polindrome number:"+isPolindrome(num));
    }
    static boolean isPolindrome(int num){
        int tempNumber=num;
        int reverseNumber=0;
        int lastNumber;

        while(tempNumber!=0){
            System.out.println("==========");
            System.out.println("Temp number:"+tempNumber);

            lastNumber=tempNumber%10;
            System.out.println("Last number:"+lastNumber);

            reverseNumber=(reverseNumber*10)+lastNumber;
            System.out.println("Reverse number:"+reverseNumber);
            tempNumber/=10;

        }

        if(reverseNumber==num){
            return true;

        }else {
            return false;
        }


    }
}
