import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int arraySize = 3; // size of the array
        int[] arrayOne = new int[arraySize]; // elements of the array
        int[] arrayTwo = new int[arraySize];

        for (int i = 0; i < arraySize; i++) {
            arrayOne[i] = scanner.nextInt();
        }

        for (int i = 0; i < arraySize; i++) {
            arrayTwo[i] = scanner.nextInt();
        }

        Arrays.sort(arrayOne);
        Arrays.sort(arrayTwo);

        if (Arrays.equals(arrayOne, arrayTwo)) {
            System.out.println("Box 1 = Box 2");
        } else if ((arrayOne[0] < arrayTwo[0]) && arrayOne[1] <= arrayTwo[1] && arrayOne[2] <= arrayTwo[2]
                || arrayOne[1] < arrayTwo[1] && arrayOne[0] <= arrayTwo[0] && arrayOne[2] <= arrayTwo[2]
                || arrayOne[2] < arrayTwo[2] && arrayOne[1] <= arrayTwo[1] && arrayOne[0] <= arrayTwo[0]) {
            System.out.println("Box 1 < Box 2");
        } else if (arrayOne[0] > arrayTwo[0] && arrayOne[1] >= arrayTwo[1] && arrayOne[2] >= arrayTwo[2]
                || arrayOne[1] > arrayTwo[1] && arrayOne[0] >= arrayTwo[0] && arrayOne[2] >= arrayTwo[2]
                || arrayOne[2] > arrayTwo[2] && arrayOne[0] >= arrayTwo[0] && arrayOne[1] >= arrayTwo[1]) {
            System.out.println("Box 1 > Box 2");
        } else {
            System.out.println("Incomparable");
        }
    }
}
