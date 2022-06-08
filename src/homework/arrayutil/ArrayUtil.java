package homework.arrayutil;

public class ArrayUtil {

    int max(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    int min(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }

        }
        return min;
    }

    void printEven(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + ",");
            }
        }

    }

    void printOdd(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.print(array[i] + ",");
            }

        }
    }

    int printEvenCount(int[] array) {
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                j++;
            }
        }
        return j;
    }

    int printOddCount(int[] array) {
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                j++;
            }
        }
        return j;
    }

    int AveregeValue(int[] array) {
        int av = 0;
        int x = 0;
        for (int i = 0; i < array.length; i++) {
            x = x + array[i];
            av = x / array.length;
        }
        return av;
    }

    int arraySum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        return sum;
    }
}