package PracticeTasks;

import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter base number:");
        int base=sc.nextInt();
        System.out.print("Enter exp number:");
        int exp= sc.nextInt();
        System.out.println("Result:"+power(base,exp));
    }
    static int power(int base,int exp){
        if(exp==0){
            return 1;
        }
        else {
            return exp=base*power(base,exp-1);
        }
    }
}
