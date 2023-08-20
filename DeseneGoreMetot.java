package PracticeTasks;

public class DeseneGoreMetot {

        public static void main(String[] args) {
            java.util.Scanner scanner = new java.util.Scanner(System.in);
            System.out.print("Bir sayı girin: ");
            int n = scanner.nextInt();
            System.out.println();
            recursiveFunction(n);


        }

        public static void recursiveFunction(int num) {
            System.out.println("Şu anki değer: " + num);

            if (num <= 0) {
                return;
            }

            recursiveFunction(num - 5);

            System.out.println("Şu anki değer: " + num);
        }


}
