package Module2.homework;


public class Task2_1 {
    static int sum(int[] array) {
        int sum = 0;
        for (int element : array) sum += element;
        return sum;
    }

    static double sum(double[] array) {
        double sum = 0;
        for (double element : array) sum += element;
        return sum;
    }

    static int min(int[] array) {
        int min = array[0];
        for (int e = 0; e < array.length; e++)
            if (array[e] < min) {
                min = array[e];
            }
        return min;
    }

    static double min(double[] array) {
        double min = array[0];
        for (int e = 0; e < array.length; e++)
            if (array[e] < min) {
                min = array[e];
            }
        return min;
    }

    static int max(int[] array) {
        int max = array[0];
        for (int item : array) {
            if (max < item) max = item;
        }
        return max;
    }

    static double max(double[] array) {
        double max = array[0];
        for (double item : array) {
            if (max < item) max = item;
        }
        return max;
    }

    static int maxPositive(int[] array) {
        int maxPositive = max(array);
        if (maxPositive < 0)
            System.out.print("There is no positive numbers. The biggest is ");
        else System.out.print("Max positive int ");
        return maxPositive;
    }

    static double maxPositive(double[] array) {
        double maxPositive = max(array);
        if (maxPositive < 0)
            System.out.print("There is no positive numbers. The biggest is ");
        else System.out.print("Max positive double ");
        return maxPositive;
    }

    static int multiplication(int[] array) {
        int mlt = 1;
        for (int item : array) {
            mlt *= item;
        }
        return mlt;
    }

    static double multiplication(double[] array) {
        double mlt = 1;
        for (double item : array) {
            mlt *= item;
        }
        return mlt;
    }

    static int modulus(int[] array) {
        return array[0] % array[array.length - 1];

    }

    static double modulus(double[] array) {
        return array[0] % array[array.length - 1];
    }

    static int secondLargest(int[] array) {
        int max = max(array);
        int result = array[array.length - 1];

        for (int element : array) {
            if (result < element && element < max) result = element;
        }
        return result;
    }

    static double secondLargest(double[] array) {
        double max = max(array);
        double result = array[0];

        for (double element : array) {
            if (result < element && element < max) result = element;
        }
        return result;

    }

    public static void main(String[] args) {
        int[] array = {15, 15, -25, 598, -699, 712, 1012, -25, 1012, 598};
        double[] doubleArray = {10.02, 29.15, -25.3, 129.15, 60.17, 71.55, 1529.15, -3.5, 1, -598.12};

        System.out.println("Sum int " + sum(array));
        System.out.println("Sum double " + sum(doubleArray));
        System.out.println("Min int " + min(array));
        System.out.println("Min double " + min(doubleArray));
        System.out.println("Max int " + max(array));
        System.out.println("Max double " + max(doubleArray));
        System.out.println(maxPositive(array));
        System.out.println(maxPositive(doubleArray));
        System.out.println("Multiplicatoin int " + multiplication(array));
        System.out.println("Multiplicatoin double " + multiplication(doubleArray));
        System.out.println("Moduls int " + modulus(array));
        System.out.println("Moduls double " + modulus(doubleArray));
        System.out.println("Second largest int " + secondLargest(array));
        System.out.println("Second largest double " + secondLargest(doubleArray));
    }
}