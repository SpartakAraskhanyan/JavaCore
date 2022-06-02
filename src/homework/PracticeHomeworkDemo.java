package homework;


public class PracticeHomeworkDemo {
    public static void main(String[] args) {
        PracticeHomework ph = new PracticeHomework();
        System.out.println(ph.convert(10) + " seconds");
        System.out.println();
        System.out.println(ph.calcAge(5) + " days");
        System.out.println();
        System.out.println(ph.nextNumber(3));
        System.out.println();
        System.out.println(ph.isSameNum(24, 33));
        System.out.println();
        System.out.println(ph.lessThanOrEqualTpZero(6));
        System.out.println();
        System.out.println(ph.reverseBool(true));
        System.out.println();
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3, 4, 5};
        System.out.println(ph.maxLength(array1, array2));
    }
}
