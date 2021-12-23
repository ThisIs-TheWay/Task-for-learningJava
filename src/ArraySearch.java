import java.time.*;
import java.util.*;

public class ArraySearch {

    static void searchThroughElements(int[] array, int searchItem) {

        for (int i = 0; i < array.length; i++) {

            if (array[i] == searchItem){
                System.out.println("Element found, index: " + i);
                return;
            }
        }

        System.out.println("The array does not contain a search element");
    }

    static void binarySearch(int[] array, int searchItem) {

        int begin = 0;
        int end = array.length;
        int midElement = 0;

        while (begin <= end) {

            midElement = (begin + end) / 2;

            if (array[midElement] > searchItem) {
                end = midElement - 1;
            } else if (array[midElement] < searchItem) {
                begin = midElement + 1;
            } else if (array[midElement] == searchItem) {
                System.out.println("Element found, index: " + midElement);
                return;
            }
        }

        System.out.println("The array does not contain a search element");
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int lengthArray = scanner.nextInt();
        int[] array = new int[lengthArray];

        Random random = new Random();
        for (int i = 0; i < lengthArray-1; i++) {
            array[i] = random.nextInt(1000);
        }

        Arrays.sort(array);

        System.out.println("Enter an item of search for up to 1000");
        int searchItem = scanner.nextInt();

        System.out.println();
        System.out.println("Search through elements");

        Instant start = Instant.now();
        searchThroughElements(array, searchItem);
        Instant finish = Instant.now();
        System.out.println("Time has passed, ms: " + Duration.between(start, finish).toMillis());

        System.out.println();
        System.out.println("Binary search");

        Instant start2 = Instant.now();
        binarySearch(array, searchItem);
        Instant finish2 = Instant.now();
        System.out.println("Time has passed, ms: " + Duration.between(start2, finish2).toMillis());

        System.out.println();
        System.out.println("Standard binary search");

        Instant start3 = Instant.now();
        int foundKey = Arrays.binarySearch(array, searchItem);

        if (foundKey < 0) {
            System.out.println("The array does not contain a search element");
        } else {
            System.out.println("Element found, index: " + foundKey);
        }

        Instant finish3 = Instant.now();
        System.out.println("Time has passed, ms: " + Duration.between(start3, finish3).toMillis());

    }

}











