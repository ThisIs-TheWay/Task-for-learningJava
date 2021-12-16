import java.util.Arrays;

public class DeleteOccurrence {

    public static void main(String[] args) {

        int[] array = new int[] {2, 4, 4, 9, 0, 4, 1, 2};
        int numberDelete = 4;
        int lastIndex = 0;

        for (int i = 0, j = 0; i < array.length; i++) {
            if (array[i] != numberDelete) lastIndex++;
        }

        int[] copyArray = new int[lastIndex];

        for (int i = 0, j = 0; i < array.length; i++) {
            if (array[i] != numberDelete) copyArray[j++] = array[i];
        }

        array = copyArray;

        System.out.println(Arrays.toString(array));
        //for (int i = 0; i < array.length; i++) {
        //    System.out.println(array[i]);
        //}

    }
}
