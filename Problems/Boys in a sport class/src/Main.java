import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h1 = scanner.nextInt();
        int h2 = scanner.nextInt();
        int h3 = scanner.nextInt();

        if (h1 <= h2 && h2 <= h3) { // 150, 160, 170 ascending order || 170, 160, 150 descending order
            System.out.println("true");
        } else if (h1 >= h2 && h2 >= h3) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}