package homework.Arrays;

public class ArrayExemple6 {
    //Տպեք մասիվի բոլոր զույգ էլեմենտները
    public static void main(String[] args) {
        int[] array = {2, 5, 8, 10, 32, 22, 11, 66, 12, 30};

        for (int i = 0; i < array.length; i++) {
                if (array[i] % 2 == 0)
                {
                    System.out.print(array[i] +" ");
                }

        }
    }
}
