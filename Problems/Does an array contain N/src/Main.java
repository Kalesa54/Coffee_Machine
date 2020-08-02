import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int len = scanner.nextInt(); // reading a length
        int[] array = new int[len];  // creating an array with the specified length
        int number = 0;
        boolean isEqual = false;

        for (int i = 0; i < len; i++) {
            array[i] = scanner.nextInt(); // read the next number of the array
        }
        number = scanner.nextInt();

        for (int in : array) {

            if (in == number) {
                isEqual = true;
            }
        }

        System.out.println(isEqual);

    }
}