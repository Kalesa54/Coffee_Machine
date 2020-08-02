import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // put your code here
        String city = scanner.nextLine();

        if (city.endsWith("burg")) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }
}