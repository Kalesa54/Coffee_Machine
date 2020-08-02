import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int number = scanner.nextInt();
        int evenNumber = 0;
        if (number <= 10_000) {
            if ((number + 1) % 2 == 0) {
                evenNumber = number + 1;
                System.out.println(evenNumber);
            } else {
                evenNumber = number + 2;
                System.out.println(evenNumber);
            }
        }
    }
}