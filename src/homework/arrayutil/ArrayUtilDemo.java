package homework.arrayutil;

public class ArrayUtilDemo {

    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 1, 9, 6};
        ArrayUtil au = new ArrayUtil();

        System.out.println("max = " + au.max(numbers));
        System.out.println();
        System.out.println("min = " + au.min(numbers));
        System.out.println();
        au.printEven(numbers);
        System.out.println();
        au.printOdd(numbers);
        System.out.println();
        System.out.println("EvenCount = " + au.printEvenCount(numbers));
        System.out.println();
        System.out.println("OodCount = " + au.printOddCount(numbers));
        System.out.println();
        System.out.println("av = " + au.AveregeValue(numbers));
        System.out.println();
        System.out.println("sum = " + au.arraySum(numbers));
    }
}
