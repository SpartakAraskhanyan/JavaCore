package homework.Arrays;

public class ArrayExample4 {
    public static void main(String[] args) {
        int numbers[] = {2,5,8,10,32,22,11,66,12,30};
        int x = 6;
        boolean y = false;
        for (int i = 0; i < numbers.length; i++) {
            if (x == numbers[i]) {
                y = true;

            }

        }

        System.out.println(y);


    }
}
