package PracticeTasks;

import java.util.Scanner;

public class NewCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option = 0, result;
        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap";
        System.out.println(menu);
        while (true) {

            System.out.print("Lütfen bir işlem seçiniz :");
            option = sc.nextInt();

            if (option == 0) {
                return;
            }

            System.out.print("1.sayi:");
            int a = sc.nextInt();
            System.out.print("2.sayi:");
            int b = sc.nextInt();

            switch (option) {
                case 1:
                    result = sum(a, b);
                    System.out.println("Result:" + result);
                    break;
                case 2:
                    result = substarct(a, b);
                    System.out.println("Result:" + result);
                    break;
                case 3:
                    result = times(a, b);
                    System.out.println("Result:" + result);
                    break;
                case 4:
                    result = divide(a, b);
                    System.out.println("Result:" + result);
                    break;

                case 5:
                    power(a, b);
                    break;
                case 6:
                    result=factorial(a);
                    System.out.println("Result:"+result);
                    break;
                case 7:
                    result=mod(a,b);
                    System.out.println("Result:"+result);
                    break;
                case 8:
                    alanCevre(a,b);
                    break;
                default:
                    System.out.println("Yeniden deneyin");
            }
        }
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int substarct(int a, int b) {
        return a - b;
    }

    public static int times(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        if (b == 0) {
            System.out.println("Böleni 0 giremezsiniz.");
        }
        return a / b;
    }

    public static void power(int a, int b) {
        int pow = 1;
        for (int i = 0; i < b; i++) {
            pow *= a;
        }
        System.out.println("Result:" + pow);
    }

    public static int factorial(int a) {
        int fact=1;
        for(int i=1;i<=a;i++){
            fact*=i;
        }
        return fact;
    }
    public static int mod(int a,int b){
        if (b==0){
            System.out.println("Böleni 0 giremezsiniz.");
        }
        return a%b;
    }
    public static void alanCevre(int a,int b){
        int alan=a*b;
        int cevre=2*(a+b);
        System.out.println("Alan:"+alan);
        System.out.println("Cevre:"+cevre);
    }

}
