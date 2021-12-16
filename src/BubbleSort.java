public class BubbleSort {

    public static void main(String[] args) {

        int[] array = new int[] {4, 5, 1, 3, 2};

        boolean noOperations = true;
        for (int y = 0; y < array.length; y++) {

            for (int i = 0; i < array.length - 1; i++) {

                if (array[i] > array[i + 1]) {

                    int moreValue = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = moreValue;

                    noOperations = false;

                }
            }

            if (noOperations) {
                break;
            } else {
                noOperations = true;
            }

        }

        String strArr = "";

        for (int i = 0; i < array.length; i++) {
            strArr += Integer.toString(array[i]);
        }

        System.out.println(strArr);
    }

}
