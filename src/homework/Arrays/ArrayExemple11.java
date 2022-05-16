package homework.Arrays;

public class ArrayExemple11 {
    //Տպեք մասիվի էլեմենտների գումարը
    public static void main(String[] args) {
        int[] array = {2,5,8,10,32,22,11,66,12,30};
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            j = j + array[i];

        }
        System.out.println(j);

    }
}
