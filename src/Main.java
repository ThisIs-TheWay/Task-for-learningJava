public class Main {

    double[] array = new double[10];

    void fillArrayRandomNumber() {
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random();
        }
    }

    double getMaxNumberArr() {

        double MaxNumber = 0;

        for (int i = 0; i < array.length; i++) {
            if(MaxNumber < array[i]) MaxNumber= array[i];
        }

        return MaxNumber;
    }

    double getMinNumberArr() {

        double MinNumber = 1;

        for (int i = 0; i < array.length; i++) {
            if(MinNumber > array[i]) MinNumber= array[i];
        }

        return MinNumber;
    }

    double getAverageNumberArr() {

        double AverageNumber = 0;
        double SummNumber = 0;
        int CountNumber = 0;

        for (int i = 0; i < array.length; i++) {
            SummNumber += array[i];
            CountNumber++;
        }

        AverageNumber = SummNumber / CountNumber;
        return AverageNumber;
    }

    public static void main(String[] args) {

        Main main = new Main();

        main.fillArrayRandomNumber();

        System.out.println("Max number - " + main.getMaxNumberArr());
        System.out.println("Min number - " + main.getMinNumberArr());
        System.out.println("Average number - " + main.getAverageNumberArr());

    }

}
