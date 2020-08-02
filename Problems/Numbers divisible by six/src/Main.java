import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = scanner.nextInt();
        int sum = 0;

        for (int i = start; i > 0; i--) {

            int number = scanner.nextInt();

            if (number % 6 == 0) {
                sum = sum + number;
            }
        }
        System.out.println(sum);
    }
}