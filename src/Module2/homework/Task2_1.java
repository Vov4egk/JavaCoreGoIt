package Module2.homework;


public class Task2_1 {
    public static void main(String[] args) {
        int[] array = {15, 20, 25, 598, 699, 712, 986, -9, 0, 598};
        double[] doubleArray = {10.02, 20.15, 25.3, 598.12, 699.17, 712.55, 986.09, -9.5, 0, 598.12};

        double doublesum = calculeDoubleSum(doubleArray);
        int intsum = calculateSum(array);

        System.out.println(doublesum);
        System.out.println(intsum);
    }

    private static double calculeDoubleSum(double[] array) {
        double sum = 0;
        for (double element : array) sum += element;
        return sum;
    }

    private static int calculateSum(int[] array) {
        int sum = 0;
        for (int element : array) sum += element;
        return sum;
    }

}