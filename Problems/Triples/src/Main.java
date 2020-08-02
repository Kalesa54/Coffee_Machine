import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int lengthArr = sc.nextInt();
        int[] arr = scan(lengthArr, sc);
        sc.close();

        System.out.println((int) triples(arr));
    }

    private static int[] scan(int len, Scanner scanner) {
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        return arr;
    }

    private static Integer triples(int[] arr) {
        int countTriples = 0;
        for (int i = 1; i < arr.length; i++) {
            if ((i + 1 < arr.length) && (arr[i] - arr[i - 1] == 1) && (arr[i + 1] - arr[i] == 1)) {
                countTriples++;
            }
        }
        return countTriples;
    }
}
