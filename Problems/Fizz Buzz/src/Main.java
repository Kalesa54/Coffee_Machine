import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();  // 8
        int end = scanner.nextInt(); // 16

        for (int i = start; i <= end; i++) {

            if (start % 3 == 0 && start % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (start % 3 == 0) {
                System.out.println("Fizz");
            } else if (start % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(start);
            }
            start++;
        }
    }
}