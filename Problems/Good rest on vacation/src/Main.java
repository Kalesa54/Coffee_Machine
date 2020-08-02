import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int duration = scanner.nextInt();
        int costs = scanner.nextInt();
        int flightCost = scanner.nextInt();
        int hotelCosts = scanner.nextInt();

        int totalCosts = duration * costs + flightCost * 2
                + hotelCosts * (duration - 1);

        System.out.println(totalCosts);
    }
}