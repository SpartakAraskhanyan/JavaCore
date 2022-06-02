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
     return array1.length > array2.length ? array1.length: array2.length;
    }
}
