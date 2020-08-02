import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number;  // 1
        int nextnumber = 0;

        do {
            number = scanner.nextInt();

            if (number > nextnumber) { // 1 > 0
                nextnumber = number;  // nextnumber = 1
            }


        } while (number != 0);
        System.out.println(nextnumber);
    }
}