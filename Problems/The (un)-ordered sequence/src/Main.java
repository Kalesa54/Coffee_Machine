import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int lastNumber = number;
        Boolean result = true;
        Boolean asc = false;
        Boolean desc = false;

        while (true) {
            number = scanner.nextInt();
            if (number == 0) {
                break;
            }
            if (lastNumber <= number && !desc) {
                lastNumber = number;
                asc = true;
            } else if (lastNumber >= number && !asc) {
                desc = true;
                lastNumber = number;
            } else {
                result = false;
                break;
            }
        }
        System.out.println(result);
    }
}