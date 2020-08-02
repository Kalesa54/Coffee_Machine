import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // number of parts
        int numberOfPrints = 0;
        int larger = 0;
        int smaller = 0;
        int perfect = 0;

        for (int i = 0; i < n; i++) {
            numberOfPrints = scanner.nextInt();

            if (numberOfPrints == 0) {
                perfect++;
            } else if (numberOfPrints == 1) {
                larger++;
            } else {
                smaller++;
            }

        }
        System.out.print(perfect + " ");
        System.out.print(larger + " ");
        System.out.println(smaller);

    }
}