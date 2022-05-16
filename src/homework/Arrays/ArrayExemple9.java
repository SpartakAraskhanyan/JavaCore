package homework.Arrays;

public class ArrayExemple9 {
    public static void main(String[] args) {
       //Տպեք կենտերի քանակը

        int[] array = {2, 5, 8, 10, 32, 22, 11, 66, 12, 30};
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0)
                j++;


        }
        System.out.print(j);

    }
}
