import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sizeOfArray = scanner.nextInt();
        int[] arr = new int[sizeOfArray]; //Arraysize
        // int[] b = new int[sizeOfArray];

        for (int i = 0; i < sizeOfArray; i++) {
            arr[i] = scanner.nextInt();
        }

        // System.out.println(Arrays.toString(arr));
        int n = 1;

        for (int i = 0; i < n; i++) {
            int j;
            int last;
            //Stores the last element of array
            last = arr[arr.length - 1];

            for (j = arr.length - 1; j > 0; j--) {
                //Shift element of array by one
                arr[j] = arr[j - 1];
            }
            //Last element of array will be added to the start of array.
            arr[0] = last;
        }


        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}