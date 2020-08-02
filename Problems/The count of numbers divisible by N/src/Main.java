import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int n = scanner.nextInt();
        int divisible = 0;
        int i = 0;
        for (i = a; i <= b; i++) {

            if (i % n == 0) {
                divisible++;
            }
        }
        System.out.println(divisible);
    }
}