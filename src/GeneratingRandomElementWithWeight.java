import java.util.Random;

public class GeneratingRandomElementWithWeight {

    private int[] arrayElement = new int[] {1, 2, 3};
    private int[] arrayWeight = new int[] {4, 4, 1};
    private int lengthArray = DetermineLengthArray();
    private int[] arrayDistributedElement = new int[lengthArray];

    private int DetermineLengthArray() {

        int localLengthArray = 0;
        for (int i = 0; i < arrayElement.length; i++) {
            for (int j = 0; j < arrayWeight[i]; j++) {
                localLengthArray++;
            }
        }

        return localLengthArray;

    }

    private void fillArrayDistributedElement() {

        int count = 0;
        for (int i = 0; i < arrayElement.length; i++) {
            for (int j = 0; j < arrayWeight[i]; j++) {
                arrayDistributedElement[count] = arrayElement[i];
                count++;
            }
        }

    }

    int getElementByWeight() {

        boolean result = isArrayFllid();
        if (result == false) {
            fillArrayDistributedElement();
        }

        Random random = new Random();
        int RandomValue = random.nextInt(lengthArray);

        return  arrayDistributedElement[RandomValue];

    }

    private boolean isArrayFllid() {

        for (int i = 0; i < arrayDistributedElement.length; i++) {
            if (arrayDistributedElement[0] != 0) return true;
        }

        return false;

    }

    public static void main(String[] args) {

        GeneratingRandomElementWithWeight greww = new GeneratingRandomElementWithWeight();
        System.out.println(greww.getElementByWeight());

    }

}
