package homework.Arrays;

public class ArrayExemple10 {
    //Տպեք մասիվի բոլոր թվերի միջին թվաբանականը (բոլոր էլեմենտների գումարը / էլեմենտների քանակի վրա)
    public static void main(String[] args) {
        int[] array = {2, 5, 8, 10, 32, 22, 11, 66, 12, 30};
        int j = 0;
        int k = 0;
        for (int i = 0; i < array.length; i++) {
            j = j + array[i];
            k = j / array.length;
        }
        System.out.println(k);

    }
}
