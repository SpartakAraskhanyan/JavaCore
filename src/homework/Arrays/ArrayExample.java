package homework.Arrays;

public class ArrayExample {
    public static void main(String[] args) {
        double numbers[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 44};
        double j = 0;
        int i = 0;

        for (i = 0; i < numbers.length; i++)
            j = j + numbers[i];

        System.out.print(j);


    }
}
