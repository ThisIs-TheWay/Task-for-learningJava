public class PrimeNumber {

    public static void main(String[] args) {

        String strPrimeNumber = "";

        for (int number = 2; number <= 100; number++) {

            int countDivisor = 0;
            for (int i = 2; i <= number; i++) {

                if (number % i == 0) countDivisor++;
            }

            if (countDivisor == 1) {

                if (number != 2){
                    strPrimeNumber += ", " + number;
                } else {
                    strPrimeNumber += Integer.toString(number);
                }
            }

        }

        System.out.println(strPrimeNumber);

    }

}
