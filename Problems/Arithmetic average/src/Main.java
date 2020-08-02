import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        try (final Scanner scanner = new Scanner(System.in)) {

            // Prompt for start and end range values from user
            final int noStart = Integer.parseInt(scanner.nextLine());
            final int noEnd = Integer.parseInt(scanner.nextLine());

            double totalNo = 0;
            int cntMatches = 0;
            for (int i = noStart; i <= noEnd; i++) {
                if (i % 3 == 0) {
//                    System.out.println(i);
                    totalNo += i;
                    cntMatches++;
                }
            }

            System.out.println(totalNo / cntMatches);
        }
    }
}