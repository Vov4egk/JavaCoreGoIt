package Module2.homework;


public class Task2_1 {
    public static void main(String[] args) {
        int[] array = {15, 20, 25, 598, 699, 712, 986, -9, 0, 598};
        double[] doubleArray = {10.02, 29.15, 25.3, 598.12, 60.17, 71.55, 986.09, -3.5, 0, 598.12};

        double doublesum = calculeDoubleSum(doubleArray);
        int intsum = calculateSum(array);

        int minArray = intMin(array);
//        double minDoubleArray = doubleMin(doubleArray);

        System.out.println(minArray);
//        System.out.println(minDoubleArray);
        System.out.println(intsum);
        System.out.println(doublesum);
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

    private static int intMin(int[] array) {
        int i;
        for (i = 0; i < array.length; i++)
            if (array[i] < i) {
                int min = array[i];
                return min;
            }
        return i;
    }

//    private static double doubleMin(double[] dooubleArr) {
//        double j = dooubleArr[0];
//        for (j = 0; j < dooubleArr.length; j++) {
//            if (dooubleArr[j] < j) {
//                double j = dooubleArr[j];
//                return j;
//            }
//        }
//
//        return j;
//    }
}