package homework;

public class PracticeHomework {


    long convert(int minutes) {

        return minutes * 60;

    }

    int calcAge(int years) {

        return years * 365;
    }

    int nextNumber(int number) {
        int a = number + 1;
        return a;
    }

    boolean isSameNum(int a, int b) {
        return a == b;

    }

    boolean lessThanOrEqualTpZero(int number) {
        boolean c = number <= 0;
        return c;
    }

    boolean reverseBool(boolean value) {

        return !value;
    }

    int maxLength(int[] array1, int[] array2) {
//        if  (array1.length > array2.length){
//            return array1.length;
//        }else {
//            return array2.length;
//        }
        return array1.length > array2.length ? array1.length : array2.length;
    }

    int[] mergeArray(int[] array1, int[] array2) {
        int[] result = new int[array1.length + array2.length];

        for (int i = 0; i < array1.length; i++) {
            result[i] = array1[i];
        }

        int f = array1.length;
        for (int i = 0; i < array2.length; i++) {
            result[f++] = array2[i];
        }

        return result;

    }

    int[] mixArray(int[] array1, int[] array2) {
        int[] result = new int[array1.length + array2.length];
        int maxLength = maxLength(array1, array2);
        int j = 0;
        for (int i = 0; i < maxLength; i++) {
            if (j <= maxLength) {
                result[j++] = array1[i];
            }
            if (j <= maxLength + array1.length)
                result[j++] = array2[i];

        }

        return result;

    }

    int[] reverseArray(int[] array3) {
        int[] result = new int[array3.length];
        int j = 0;
        for (int i = array3.length - 1; i >= 0; i--) {

            result[j++] = array3[i];


        }
        return result;


    }


    public void reverseArray2(int[] array4) {

        int x = 0;
        int y = array4.length - 1;
        for (int i = 0; i < array4.length / 2; i++) {

            x = array4[i];
            array4[i] = array4[y];
            array4[y--] = x;

        }

    }

    //grel metod vory knduni tveri masiv, u ete et tveri gumary zuyg exav kveradarcne true, ete che false
    boolean isSumEven(int[] array4) {

        int sum = 0;
        boolean y = false;
        for (int i = 0; i < array4.length; i++) {
            sum = sum + array4[i];}
            if (sum % 2 == 0) {
                y = true;
            }



        return y;
    }


    //grel metod vory knduni tveri masiv ev mi hat tiv, petq e veradarcnel et tvi qanaky mer masivum
    int metod (int[]array4,int y) {
        int x = 0;


        for (int i = 0; i < array4.length; i++) {
              if (array4[i] == y)
                  x++;

            }
        return x;
    }
}
